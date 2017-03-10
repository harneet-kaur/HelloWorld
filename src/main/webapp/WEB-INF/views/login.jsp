<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form onsubmit="checkAuthentication()">
	<table align="center" border="1">
		<tr>
			<td colspan="2" align="center">Secure Login</td>		
		</tr>
		<tr>
			<td>Username</td>
			<td> <input type="text" name="username" id="username"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td> <input type="password" name="password" id="password"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"> <input type="submit" value="Login"> </td>		
		</tr>
		<tr>
			<td colspan="2" align="center"> <a href="#" >Forget Password</a> </td>
			
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">
function checkAuthentication(){
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	alert(username);
	$.ajax({
		type: "GET",
		url: "/authenticate-user",
		data: {
			username : username,
			password : password
		},
		success : function(result){
			alert("OK");
		},
		error : function(result){
			alert("OOPPS");
		}
	});
}
</script>
</html>
