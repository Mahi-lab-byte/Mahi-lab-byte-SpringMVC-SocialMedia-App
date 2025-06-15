<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>posts and comments</title>
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
		<div style="padding-left:40%;">
			<h2>Post and comments</h2>		
		</div>
		<!-- Card -->
		<div style="padding-left:20%;padding-right:20%;">
		<div class="card text-center">
		  <div class="card-header">
		    ${post.username}
		  </div>
		  <div class="card-body">
		    <h5 class="card-title">${post.heading}</h5>
		    <p class="card-text">${post.story}</p>
		    
		  </div>
		  <div class="card-footer text-muted">
		    COMMENTS
		    <hr>
		    <c:forEach var="comments" items="${comments}">
			${comments.username} : ${comments.comment}
				<hr>
			</c:forEach>
		    
		    <p>write the comment</p>
		    
		    
		    
			<form:form action="saveComment" modelAttribute="newcomment" method="POST">
				<input type="hidden" name="postid" value="${post.id}" />
				<form:input type="text" path="comment" name="comment" placeholder="Write the comment"/>
				&nbsp;&nbsp;
				
				<input type="submit" value="Send" />		    
		    </form:form>
		    
		  </div>
		</div>
		</div>


</body>
</html>