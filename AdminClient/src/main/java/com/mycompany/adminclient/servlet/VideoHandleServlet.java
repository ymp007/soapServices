/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adminclient.servlet;

import com.mycompany.adminclient.services.Streamingvideos;
import com.mycompany.adminclient.services.VideoService;
import com.mycompany.adminclient.services.VideoService_Service;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author YMP
 */
@WebServlet(name = "VideoHandleServlet", urlPatterns = {"/VideoHandleServlet"})
public class VideoHandleServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VideoHandleServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VideoHandleServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("addvideo")!= null){
            
                String title = request.getParameter("title");
                String link = request.getParameter("link");
                String category = request.getParameter("category");
                String description = request.getParameter("description");
//                try{
//                Part part = request.getPart("thumbnail");
//                ByteArrayOutputStream bytes= new ByteArrayOutputStream();
//                InputStream filecontent = part.getInputStream();
//                byte[] buffer = new byte[(int) part.getSize()];
//                int read = 0;
//                while((read=filecontent.read(buffer))!= -1){
//                    bytes.write(buffer,0,read);
//                }
//                
//            }catch(Exception ex){
//                Logger.getLogger(VideoHandleServlet.class.getName()).log(Level.SEVERE,null,ex);
//                RequestDispatcher dispacher = request.getRequestDispatcher("/index.jsp");
//                dispacher.include(request, response);
//            }
                
                String Admin="Yash Patel";
                Streamingvideos sv = new Streamingvideos();
                sv.setAdmins(Admin);
                sv.setTitle(title);
                sv.setLink(link);
                sv.setCategory(category);
                sv.setDescription(description);
                VideoService_Service vs = new VideoService_Service();
                VideoService vs_port = vs.getVideoServicePort();
                vs_port.addVideos(sv);
                PrintWriter pw = response.getWriter();
                pw.write("<script>alert('Video is Added')</script>");
                RequestDispatcher dispacher = request.getRequestDispatcher("/index.jsp");
                dispacher.include(request, response);
                
        }else if(request.getParameter("updatevideo") != null){
                
                
                String id = request.getParameter("id");
                String title = request.getParameter("title");
                String link = request.getParameter("link");
                String category = request.getParameter("category");
                String description = request.getParameter("description");
                String Admin="Patel";
                Streamingvideos sv;
                
                VideoService_Service vs = new VideoService_Service();
                VideoService vs_port = vs.getVideoServicePort();
                sv = vs_port.getVideos(id);
                
                sv.setAdmins(Admin);
                sv.setTitle(title);
                sv.setLink(link);
                sv.setCategory(category);
                sv.setDescription(description);
                vs_port.updateVideos(sv);
                PrintWriter pw = response.getWriter();
                pw.write("<script>alert('Video is Updated')</script>");
                showList(request, response);
        }else if(request.getParameter("find")!=null){
            
                String id = request.getParameter("id");
                
                
                VideoService_Service vs = new VideoService_Service();
                VideoService vs_port = vs.getVideoServicePort();
                Streamingvideos sv = vs_port.getVideos(id);
                if(sv!=null){
                request.setAttribute("id", sv.getId());    
                request.setAttribute("title", sv.getTitle());
                request.setAttribute("link", sv.getLink());
                request.setAttribute("category", sv.getCategory());
                request.setAttribute("description", sv.getDescription());
                RequestDispatcher dispacher = request.getRequestDispatcher("/update.jsp");
                dispacher.include(request, response);
                }else{
                PrintWriter pw = response.getWriter();
                pw.write("<script>alert('Video is Updated')</script>");    
                    showList(request, response);
                }
        }else if(request.getParameter("delete")!=null){
            
                String id = request.getParameter("id");
                
                
                VideoService_Service vs = new VideoService_Service();
                VideoService vs_port = vs.getVideoServicePort();
                vs_port.deleteVideos(id);
                showList(request, response);
        }else if(request.getParameter("showlist")!=null){
            
                showList(request, response);
        }
        
    }
    private void showList(HttpServletRequest request, HttpServletResponse response){
        try {
            VideoService_Service vs = new VideoService_Service();
            VideoService vs_port = vs.getVideoServicePort();
            List<Streamingvideos> videoList = vs_port.getallVideos();
            request.setAttribute("videoList", videoList);
            RequestDispatcher dispacher = request.getRequestDispatcher("/show_videos.jsp");
            dispacher.include(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(VideoHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VideoHandleServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
