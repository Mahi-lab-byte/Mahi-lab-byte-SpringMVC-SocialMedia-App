<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!doctype html>
<html lang="en">
<head>
<title>
company
</title>
 <link rel = "icon" href ="https://www.clipartkey.com/mpngs/m/7-77917_hospital-icon-clipart-png-download-hospital-icon.png" 
        type = "image/x-icon"> 
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://colorlib.com/etc/bootstrap-sidebar/sidebar-04/css/style.css">

</head>
<body>

	<div class="wrapper d-flex align-items-stretch">
		<nav id="sidebar">
			<h1>
				<a href="#" class="logo">COLLABORATION</a>
			</h1>
			<ul class="list-unstyled components mb-5">
				<li class="active"><a href="${pageContext.request.contextPath}/"><span
						class="fa fa-home mr-3"></span> Homepage</a></li>
				<li class="active"><a href="${pageContext.request.contextPath}/profile"><span
						class="fa fa-car mr-3"></span>Profile</a></li>
				
				
				<form:form action="${pageContext.request.contextPath}/logout"
					method="POST">
					<li>
					<div style="padding-top:0px;" >
					<input type="submit" value="logout" style="padding-left:70px;padding-right:125px;background-color:black;color:white;height:50px;"></div>
					</li>
				</form:form>
			</ul>

		</nav>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5 pt-5">
			<h2 class="mb-4"  align="center"><u>DashBoard</u></h2>
			
			<div class="row">
				<div class="col">
					
			
					Welcome <security:authentication property="principal.username" />
					
				</div>
				<div class="col">
					<div style="padding-left:50%;">
						<button type="button" class="btn btn-primary" data-target="#exampleModal" data-toggle="modal">Add POST</button>
					</div>
				</div>	
			</div>
				
			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h5 class="modal-title" id="exampleModalLabel">New Post</h5>
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
			          <span aria-hidden="true">&times;</span>
			        </button>
			      </div>
			      <div class="modal-body">
				        <form:form action="savepost" modelAttribute="post" method="POST">
						  <div class="form-group" style="color:black;">
						    <label >Heading</label>
						    <form:input type="text" path="heading" class="form-control" aria-describedby="heading" placeholder="Enter heading" />
						   </div>
						  <div class="form-group" style="color:black;">
						    <label for="exampleInputPassword1">Story</label>
						    <form:input type="text" path="story" class="form-control" id="story" placeholder="Enter story"/>
						    
						  </div>
						  
						 <div style="padding-left:60%">
						  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						 
						  <input type="submit" class="btn btn-primary" value="  Post  " />
						  </div>
						  
						 <!-- https://getbootstrap.com/docs/4.0/components/forms/ -->
						</form:form>
			        	
			        	
			        				        
			        
			        
			      </div>
			    
			    </div>
			  </div>
			</div>
			
			
			<div style="padding-top:5%;padding-left:10%;">
			<c:forEach var="allposts" items="${allposts}">
			
			<c:url var="viewcomments" value="showComments">
								<c:param name="id" value="${allposts.id}" />
			</c:url>
			
			
			<div class="card" style="width: 40rem;">
				<div class="card-body">
					<div class="row">
						<div class="col">
							<h5 class="card-title" >${allposts.username}</h5>
						</div>
						<div class="col" style="padding-left:50%;">
								<p>Posted at : ${allposts.date}</p>
						</div>
					</div>
						<h6 class="card-subtitle mb-2 text-muted" style="padding-left:40%;">${allposts.heading}</h6>
						<p class="card-text">${allposts.story}</p>
						<p><a>Like </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="${viewcomments}" >Comments</a></p>
						
						
			
						
					</div>
				</div>
				<br><br>
			</c:forEach>
			</div>
			
			
			
			
			
			
			
			
			
			
			</div>
		</div>

	
	<script
		src="https://colorlib.com/etc/bootstrap-sidebar/sidebar-04/js/jquery.min.js"></script>
	<script
		src="https://colorlib.com/etc/bootstrap-sidebar/sidebar-04/js/popper.js"></script>
	<script
		src="https://colorlib.com/etc/bootstrap-sidebar/sidebar-04/js/bootstrap.min.js"></script>
	<script
		src="https://colorlib.com/etc/bootstrap-sidebar/sidebar-04/js/main.js"></script>
</body>
</html>