<!DOCTYPE html>
<%@ include file="/common/taglibs.jsp" %>
<html lang="en">
<head>
    <title><decorator:title default="Bienvenidos"/> | <fmt:message key="webapp.name"/></title>
    <meta http-equiv="Cache-Control" content="no-store"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${ctx}/images/favicon.ico" type="image/x-icon"/>
    <link href="${ctx}/assets/css/bootstrap.css" rel="stylesheet" />
	<link href="${ctx}/assets/css/font-awesome.css" rel="stylesheet" />
	<link href="${ctx}/assets/css/custom.css" rel="stylesheet" />
	<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
	<script src="${ctx}/assets/js/jquery-1.10.2.js"></script>
	<script src="${ctx}/assets/js/bootstrap.min.js"></script>
	
	<!--
	 <link rel="stylesheet" href="${ctx}/styles/app.css"> 
     <script type="text/javascript" src="${ctx}/webjars/jquery/1.11.1/jquery.min.js"></script> 
     <script type="text/javascript" src="${ctx}/webjars/bootstrap/3.3.1/js/bootstrap.min.js"></script> 
     <script type="text/javascript" src="${ctx}/scripts/app.js"></script> 
     -->
</head>
<body<decorator:getProperty property="body.id" writeEntireProperty="true"/>
	<decorator:getProperty property="body.class" writeEntireProperty="true"/>>
<div id="wrapper">
	 <nav class="navbar navbar-default navbar-cls-top  navbar-fixed-top" role="navigation" style="margin-bottom: 0">
	      <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
	              <span class="sr-only">Toggle navigation</span>
	              <span class="icon-bar"></span>
	              <span class="icon-bar"></span>
	              <span class="icon-bar"></span>
	          </button>
	           <a class="navbar-brand" href="#">TNG24</a> 
	           <security:authorize ifAnyGranted="ROLE_TEC">
	          	<a class="navbar-brand" href="#">Técnico</a> 
	           </security:authorize>
           		 <security:authorize ifAnyGranted="ROLE_CT">
	          	<a class="navbar-brand" href="#">Coordinadora</a> 
	           </security:authorize>
	          
	      </div>
	  <div style="color: white;	padding: 15px 50px 5px 50px;float: right;font-size: 16px;">
	   26 de Mayo de 2017
	    &nbsp; 
	    <security:authorize ifAnyGranted="ROLE_TEC,ROLE_CT">
            <!--  <li class="logout"><a id="logout" href="${ctx}/logout">Logout</a>  </li>--> 
             	<a  href="${ctx}/logout" class="btn btn-danger square-btn-adjust">Logout</a>
         </security:authorize>
      </div>
	</nav>
	<nav class="navbar-default navbar-side" role="navigation">
         <div class="sidebar-collapse">
           <ul class="nav" id="main-menu">
	           <li class="text-center"><img src="assets/img/find_user.png" class="user-image img-responsive"/></li>
	            <security:authorize ifAnyGranted="ROLE_TEC, ROLE_CT">
	             <li><a href="clientes"><i class="fa fa-desktop fa-3x"></i> Clientes</a></li>
	           </security:authorize>
   	           <security:authorize ifAnyGranted="ROLE_TEC">
		           <li><a href="hojaderuta"> <i class="fa fa-dashboard fa-3x"></i> Hoja de ruta</a></li>
	           </security:authorize>
	            <security:authorize ifAnyGranted="ROLE_CT">
	           	  <li><a href="agenda"> <i class="fa fa-dashboard fa-3x"></i>Agenda</a></li>
	           </security:authorize>
	            <security:authorize ifAnyGranted="ROLE_TEC, ROLE_CT">
		           <li><a href="presupuestos"><i class="fa fa-qrcode fa-3x"></i> Presupuestos</a></li>
	           </security:authorize>
	           <security:authorize ifAnyGranted="ROLE_CT">
                   <li><a href="facturas"><i class="fa fa-qrcode fa-3x"></i>Facturas</a></li>
	           </security:authorize>
	           <security:authorize ifAnyGranted="ROLE_CT">
        			<li><a  href="desempeño"><i class="fa fa-bar-chart-o fa-3x"></i>Desempeño Técnicos</a></li>
	           </security:authorize>
	           <security:authorize ifAnyGranted="ROLE_CT">
	           	<li><a  href="usuarios"><i class="fa fa-desktop fa-3x"></i>Usuarios</a></li>
	           </security:authorize>
	           <security:authorize ifAnyGranted="ROLE_CT">
	           <li><a  href="encuesta"><i class="fa fa-edit fa-3x"></i>Encuestas</a></li>
	           </security:authorize>
	           <security:authorize ifAnyGranted="ROLE_TEC, ROLE_CT">
		           <li><a href="facturas"><i class="fa fa-bar-chart-o fa-3x"></i> Facturas</a></li> 
	           </security:authorize>
	            <security:authorize ifAnyGranted="ROLE_TEC">
		           <li><a href="stock"><i class="fa fa-table fa-3x"></i>Stock</a></li>
	           </security:authorize>
            </ul>
          </div>
     </nav> 
     <div id="page-wrapper">
            <div id="page-inner">
             	<decorator:body/>
            </div>
      </div>
</div>


   
    


<script type="text/javascript">
            $('a[href="${pageContext.request.requestURI}"]').parent().addClass('active');
        </script>

</body>
</html>
