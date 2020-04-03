<%-- 
    Document   : show_videos
    Created on : 2-Apr-2020, 10:24:04 PM
    Author     : YMP
--%>

<%@page import="com.mycompany.adminclient.services.Streamingvideos"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.adminclient.services.VideoService"%>
<%@page import="com.mycompany.adminclient.services.VideoService_Service"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Show</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="css/main.css" >
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">YMP</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Add/Update Video</a>
                    </li>
                    <form class="form-inline ml-auto">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
            </div>
        </nav>
        <section id="showVideo">
            <div class="main-container container d-flex justify-content-center">
                <div class="container justify-content-center" >
                    <div class="row">
                        <div class="col">
                            <h1>YMP Videos</h1>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col">
                            <table class="table">
                                <c:forEach items="${videoList}" var="video">
                                    <tr>
                                        <td>
                                            <c:out value = "${video.title}"/>
                                        </td>
                                        <td><a href="http://${video.link}">
                                                <c:out value = "${video.link}"/></a>
                                        </td>
                                        <td>
                                            <c:out value = "${video.admins}"/>
                                        </td>
                                        <td>
                                            <c:out value = "${video.category}"/>
                                        </td>
                                        <td>
                                            <form method="post" action="VideoHandleServlet">
                                                <div class="form-group">
                                                    <input type="hidden" name="id" value="${video.id}"/>
                                                    <input type="submit" name="find" value="Update" class="btn btn-primary"/>
                                                    <input type="submit" name="delete" value="Delete" class="btn btn-danger"/>
                                                </div>
                                            </form>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </div>
                    </div>

                </div>
            </div>
        </section>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    </body>
</html>
