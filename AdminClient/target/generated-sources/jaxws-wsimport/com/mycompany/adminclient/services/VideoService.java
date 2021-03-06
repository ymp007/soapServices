
package com.mycompany.adminclient.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VideoService", targetNamespace = "http://services.soapservices.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VideoService {


    /**
     * 
     * @param title
     * @return
     *     returns java.util.List<com.mycompany.adminclient.services.Streamingvideos>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVideosByTitle", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.GetVideosByTitle")
    @ResponseWrapper(localName = "getVideosByTitleResponse", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.GetVideosByTitleResponse")
    @Action(input = "http://services.soapservices.mycompany.com/VideoService/getVideosByTitleRequest", output = "http://services.soapservices.mycompany.com/VideoService/getVideosByTitleResponse")
    public List<Streamingvideos> getVideosByTitle(
        @WebParam(name = "title", targetNamespace = "")
        String title);

    /**
     * 
     * @param id
     * @return
     *     returns com.mycompany.adminclient.services.Streamingvideos
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVideos", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.GetVideos")
    @ResponseWrapper(localName = "getVideosResponse", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.GetVideosResponse")
    @Action(input = "http://services.soapservices.mycompany.com/VideoService/getVideosRequest", output = "http://services.soapservices.mycompany.com/VideoService/getVideosResponse")
    public Streamingvideos getVideos(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.adminclient.services.Streamingvideos>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getallVideos", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.GetallVideos")
    @ResponseWrapper(localName = "getallVideosResponse", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.GetallVideosResponse")
    @Action(input = "http://services.soapservices.mycompany.com/VideoService/getallVideosRequest", output = "http://services.soapservices.mycompany.com/VideoService/getallVideosResponse")
    public List<Streamingvideos> getallVideos();

    /**
     * 
     * @param video
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateVideos", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.UpdateVideos")
    @ResponseWrapper(localName = "updateVideosResponse", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.UpdateVideosResponse")
    @Action(input = "http://services.soapservices.mycompany.com/VideoService/updateVideosRequest", output = "http://services.soapservices.mycompany.com/VideoService/updateVideosResponse")
    public String updateVideos(
        @WebParam(name = "video", targetNamespace = "")
        Streamingvideos video);

    /**
     * 
     * @param video
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addVideos", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.AddVideos")
    @ResponseWrapper(localName = "addVideosResponse", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.AddVideosResponse")
    @Action(input = "http://services.soapservices.mycompany.com/VideoService/addVideosRequest", output = "http://services.soapservices.mycompany.com/VideoService/addVideosResponse")
    public String addVideos(
        @WebParam(name = "video", targetNamespace = "")
        Streamingvideos video);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteVideos", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.DeleteVideos")
    @ResponseWrapper(localName = "deleteVideosResponse", targetNamespace = "http://services.soapservices.mycompany.com/", className = "com.mycompany.adminclient.services.DeleteVideosResponse")
    @Action(input = "http://services.soapservices.mycompany.com/VideoService/deleteVideosRequest", output = "http://services.soapservices.mycompany.com/VideoService/deleteVideosResponse")
    public String deleteVideos(
        @WebParam(name = "id", targetNamespace = "")
        String id);

}
