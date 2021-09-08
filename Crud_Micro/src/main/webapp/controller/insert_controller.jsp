<%@page import="CRUD.Insert_values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String sl_no=request.getParameter("sl_no");
String email=request.getParameter("email");
String mobile=request.getParameter("mobile");
String user_name=request.getParameter("user_name");


Insert_values obj_Insert=new Insert_values();

obj_Insert.insert_val(sl_no,user_name,email,mobile);
%>

<script type="text/javascript">
window.location.href="http://localhost:8086/JSP_Mysql_crud/insert_values.jsp"
</script>

</body>
</html>