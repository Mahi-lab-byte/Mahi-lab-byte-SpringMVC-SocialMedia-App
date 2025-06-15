     <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel = "icon" href ="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZzsRJn1M865Zfto6riI_hIFfdOnkwsmvcpQ&usqp=CAU" 
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

<title>Book Vehicle</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;

}
</style>
<script>
function myFunction() {
	const params = new URLSearchParams(window.location.search)
	const p=0;
	for (const param of params) {
	  console.log(param[1]);
	  document.getElementById("kk").value=param[1];
	  return param[1];
	}
}
</script>
</head>
<body  onload="myFunction()">



		<div style="padding-top:1%">
			<div class="row">
				<div class="col">
					
			<h2 class="mb-4"  align="center"><u>SIGN UP</u></h2>
		
					
				</div>
			</div>
			</div>

		<div style="padding-top:2%">
<div class="container">
  <form:form action="signupuser" modelAttribute="signup" method="POST">
  	
  	 <label for="username">Username : </label>
	<form:input type="text" path="username" id="kk" name="username" />
	
	
    <label for="password">Password :</label>
    <form:input type="text" path="password"  name="password" value="${credentails.username}" />
    
    <label for="mobile">Mobile</label>
    <form:input type="text" path="mobile" name="mobile" placeholder="mobile"/>
	
    <label for="address1">Address-1</label>
    <form:input type="text" path="address1" name="address1" placeholder="address1"/>
	
	<label for="address2">Address-2</label>
    <form:input type="text" path="address2" name="address2" placeholder="address2"/>
	
	<label for="town">town</label>
    <form:input type="text" path="town" name="town" placeholder="town"/>
	
	<label for="postcode">PostCode</label>
    <form:input type="text" path="postcode" name="postcode" placeholder="postcode"/>
	
	<label for="Age">Age</label>
    <form:input type="text" path="age" name="Age" placeholder="age"/>
	
	   
    <input type="submit" value="Signup" />
  </form:form>
</div>
</div>






</body>