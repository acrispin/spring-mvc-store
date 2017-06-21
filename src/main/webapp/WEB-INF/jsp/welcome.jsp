<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.contextPath}" scope="request" />
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Welcome</title>
     <link href="${cp}/static/css/bootstrap.min.css" rel="stylesheet" />
     <link href="${cp}/static/css/font-awesome.min.css" rel="stylesheet" />
     <link href="${cp}/static/css/alertify.css" rel="stylesheet" />
     <link href="${cp}/static/css/alertify-bootstrap-3.css" rel="stylesheet" />
     <link href="${cp}/static/css/main.css" rel="stylesheet" />    
</head>
<body>
        <div id="menubar">
    <nav class="navbar navbar-default">
        <div class="container-fluid" style="margin-left: 114px">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle Navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Tribal</a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-left">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Entidades <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#article">Artículos</a></li>
                            <li><a href="#warehouse">Almacenes</a></li>
                            <li><a href="#reason">Motivos</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Procesos <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#storageOrder">Orden de ingreso</a></li>
                            <li class="divider"></li>
                            <li><a href="#pickupOrder">Orden de salida</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Consultas <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#stock">Stock por Producto</a></li>
                            <li><a href="#kardex">Kardex</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Configuracion <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#user">Usuarios</a></li>
                            <li class="divider"></li>
                            <li><a id="logout" href="#logout">Logout</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
 </div>

        <div class="container">
            <div class="container-fluid">
                <div id="main">
                    
                </div>
            </div>            
        </div>
    
    <hr>

<div id="loadingpage">
    <div id="loadingcenter">
        <img src="${cp}/static/img/loadingpage.gif" />
        <br />
    </div>
</div>
        <script type="text/javascript">
            var main_globals = {};
            main_globals.virtualPath = "${cp}";
            main_globals.galoPath = "/galo/data/";
            main_globals.flagDevelop = true;
            main_globals.sysVersion = "12345678";
            main_globals.userFullname = "Administrador";
        </script>
        <script src="${cp}/static/js/libs/underscore-min.js"></script>
        <script src="${cp}/static/js/libs/jquery-1.11.1-min.js"></script>
        <script src="${cp}/static/js/libs/handlebars.min.js"></script>
        <script src="${cp}/static/js/libs/backbone-min.js"></script>
        <script src="${cp}/static/js/utils/i18n.js"></script>
        <script src="${cp}/static/js/libs/bootstrap.min.js"></script>
        <script src="${cp}/static/js/libs/require-min.js" data-main="${cp}/static/js/core/main.js?v=1.0"></script>
</body>
</html>