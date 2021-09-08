<%@page import="java.util.Iterator"%>
<%@page import="comman.User_Bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.Read_values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

<h1> Insert Values</h1>

<form action="controller/insert_controller.jsp">

Sl_NO     : <input type="text" name="sl_no"> <br>
User Name : <input type="text" name="user_name"><br>
Mobile    : <input type="text" name="mobile"> <br>
Email     : <input type="text" name="email">  <br>


<input type="submit" value="Insert">
<br>
Want to go back to Home Page!!
<a href="http://localhost:8891/test1/respond.jsp">Click here to Go </a>
</form>
<br>

<%
Read_values obj_Read_v =new Read_values();

List<User_Bean> list= obj_Read_v.get_values();

Iterator<User_Bean> it=list.iterator();
%>
<table border="1">
<% 
while(it.hasNext())
{
	User_Bean obj_User_Bean = new User_Bean();
	obj_User_Bean=it.next();
	
%>
          <tr>
               <td><%=obj_User_Bean.getSl_no() %></td>
               <td><%=obj_User_Bean.getUser_name() %></td>
               <td><%=obj_User_Bean.getEmail() %></td>
               <td><%=obj_User_Bean.getMobile() %></td>
          </tr>
<%	
}
%>
</table>

</center>

</body>
</html>