<%-- 
    Document   : index
    Created on : 2-Apr-2020, 3:31:33 AM
    Author     : YMP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="css/main.css" >
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top">
            <a class="navbar-brand" href="#">YMP</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Add Video</a>
                    </li>
                    <form class="form-inline ml-auto">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
            </div>
        </nav>
        <section id="updateVideo">
            <div class="main-container container d-flex justify-content-center">
                <div class="container justify-content-center" >
                    <div class="row">
                        <div class="col">
                            <h1>Update Video</h1>
                        </div>
                    </div>

                    <form method="post" action="VideoHandleServlet">
                        <div class="row">
                            <div class="col-md-5">
                                <div class="form-group">
                                    <input type="hidden" class="form-control" name = "id" id="exampleInputEmail1" value="${id}"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-5">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Title</label>
                                    <input type="text" class="form-control" name = "title" id="exampleInputEmail1" value="${title}"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <label>Link</label>
                                <input type="text" name="link" class="form-control" value="${link}"/><br/>
                            </div>
                        </div>
                            <div class="row">
                            <div class="col-md-4">
                                <label>Category</label>
                                <input type="text" name="category" class="form-control" value="${category}"/><br/>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <label>Description</label>
                                <textarea class="form-control" name="description" style="resize: none" rows="2">${description}</textarea><br/>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <label>Thumbnail</label><br/>
                                <input type="file" name="thumbnail" class="form-input" accept=".jpg,.png"/><br/>
                            </div>
                        </div>
                        <input type="submit" name="updatevideo" value="Update Video" class="btn btn-success"/>
                        <input type="submit" name="showlist" value="Show List" class="btn btn-success"/>
                    </form>
                </div>
            </div>
        </section>
    </body>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>
