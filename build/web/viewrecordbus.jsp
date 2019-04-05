<%@page import="java.util.List"%>
<%@page import="model.bus"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
               <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
               <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <style>
            *{
                margin:0;
            }
            body 
            {
                background-image: url("v1.jpg");
                background-repeat: no-repeat;
                background-size: cover;
            }
         #customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 90%;
}

#customers td, #customers th {
    border: 3px solid black;
    padding: 20px;
}

#customers tr:nth-child(even){background-color: white;}

#customers tr:hover {background-color: #303952;color: white;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: dodgerblue;
    color: white;
}
.head 
{
	display: flex;
	justify-content: center;
	align-items: center;
	background-color:rgba(38,101,201,0.45);
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
        
}
    .table td, .table th {
    padding: 1rem;
    vertical-align: top;
    border-top: 1px solid #fefefe;
    }
.table-dark td
{
    border-color:#fefefe;
}
.table-dark
{
    background-color:rgba(46, 134, 222,0.5);
}
i
{
  position: absolute;
  top: 30px;
  right: 40px;
  height: 100px;
}
         </style>
    </head>
    <body>
        <div class="head">
             <b>Bus Record Details</b>
             <a href="adminportal1.jsp"> <i class="fa fa-backward" style="font-size:48px;color:#dcdde1"></i></a>
        </div>
        <div class="cont">
            <table class="table table-dark table-hover">
<tr>
    <th><B>Bus ID</b></th>
    <th><B>Driver ID</b></th>
    <th><b>Driver Name</b></th>
    <th><b>Driver Contact</b></th>
    <th><b>Arrival At</b></th>
    <th><B>Arrival Time</b></th>
    
</tr>
<%
   List<bus> records =  (List<bus>)request.getAttribute("list");   
   for(bus s: records)
   {

     
%>
<tr>
<td><%=s.getBId()%></td>
<td><%=s.getDId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getContact()%></td>
<td><%=s.getArival()%></td>
<td><%=s.getTime()%></td>
</tr>
<%
}
%>
</table>
            
            
        </div>
    </body>
</html>
