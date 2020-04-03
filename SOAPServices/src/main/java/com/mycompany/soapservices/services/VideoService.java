/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.soapservices.services;

import com.mycompany.soapservices.Streamingvideos;
import com.mycompany.soapservices.StreamingvideosJpaController;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author YMP
 */
@WebService(serviceName = "VideoService")
@HandlerChain(file = "VideoService_handler.xml")
public class VideoService {

    /**
     * This is a sample web service operation
     */
     @WebMethod(operationName = "addVideos")
    public String addVideos(@WebParam(name="video") Streamingvideos video){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "db" );
        StreamingvideosJpaController svjpac = new StreamingvideosJpaController(emfactory);
        
        video.setId( BigDecimal.valueOf(Math.round(Math.random())*1000));   
        try {
            svjpac.create(video);
            return "videos Added";
        } catch (Exception ex) {
            Logger.getLogger(VideoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "video didn't added";
    }
    
    @WebMethod(operationName = "updateVideos")
    public String updateVideos(@WebParam(name="video") Streamingvideos video){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "db" );
        StreamingvideosJpaController svjpac = new StreamingvideosJpaController(emfactory);
        try {
            svjpac.edit(video);
            return "video updated";
        } catch (Exception ex) {
            Logger.getLogger(VideoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";
    }
    
    @WebMethod(operationName = "deleteVideos")
    public String deleteVideos(@WebParam(name="id") String id){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "db" );
        StreamingvideosJpaController svjpac = new StreamingvideosJpaController(emfactory);
        try {
            svjpac.destroy(BigDecimal.valueOf(Double.parseDouble(id)));
            return "video deleted";
        } catch (Exception ex) {
            Logger.getLogger(VideoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";
    }
    
    @WebMethod(operationName = "getallVideos")
    public List<Streamingvideos> getallVideos(){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "db" );
        StreamingvideosJpaController svjpac = new StreamingvideosJpaController(emfactory);
        List<Streamingvideos> videoList = new ArrayList<>();
        videoList = svjpac.findStreamingvideosEntities();
        return videoList;
    }
    
    @WebMethod(operationName = "getVideos")
    public Streamingvideos getVideos(@WebParam(name="id") String id){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "db" );
        StreamingvideosJpaController svjpac = new StreamingvideosJpaController(emfactory);
        Streamingvideos vd = svjpac.findStreamingvideos(BigDecimal.valueOf(Double.parseDouble(id)));
        return vd;
    }
    
    @WebMethod(operationName = "getVideosByTitle")
    public List<Streamingvideos> getVideosByTitle(@WebParam(name="title") String title){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "db" );
        StreamingvideosJpaController svjpac = new StreamingvideosJpaController(emfactory);
        List<Streamingvideos> vd = svjpac.findStreamingvideosEntities();
        List<Streamingvideos> foundVd = new ArrayList<>();
        for(Streamingvideos sv : vd){
            if(sv.getTitle().contains(title)){
                foundVd.add(sv);
            }
        }
        return foundVd;
    }
}
