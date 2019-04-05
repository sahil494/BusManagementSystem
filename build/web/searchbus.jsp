<%@page import="java.util.List"%>
<%@page import="model.route1"%>
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
        <title>Route Details</title>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <style>
             body 
            {
                background-image: url("V6.jpg");
                background-repeat: no-repeat;
                background-size: cover;
            }
         #customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border-color:#fefefe;
    padding: 40px;
}

#customers tr:nth-child(even){background-color: white;}

#customers tr:hover {background-color: #303952;color: white;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    color: white;
    border-color:white;
}
.head 
{
	display: flex;
	justify-content: center;
	align-items: center;
	background-color:rgba(139,195,74,0.6);
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
}
.table-dark td
{
    border-color:#fefefe;
}
.table-dark
{
    background-color: rgba(76,175,80,0.6);
}
.table-dark th
{
    border-color: #fefefe;
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
             <b>Route Details</b>
              <a href="user.jsp"><i class="fa fa-backward" style="font-size:48px;color:#16a085"></i></a>
		</div>
        <div class="cont">
            <table class="table table-dark table-hover">
<tr>
    <th><B>Route Code</b></th>
    <th><B>Route Name</b></th>
    <th><b>Pick-Up-Point</b></th>
    <th><b>Destination</b></th>
    <th><b>Driver Name</b></th>
    <th><B>Time</b></th>
    
</tr>
<%
   List<route1> records =  (List<route1>)request.getAttribute("list");
   System.out.print(records);   
   for(route1 s: records)
   {

     
%>
<tr>
<td><%=s.getRcode()%></td>
<td><%=s.getRname()%></td>
<td><%=s.getPpoint()%></td>
<td><%=s.getDestination()%></td>
<td><%=s.getDname()%></td>
<td><%=s.getTime()%></td>
</tr>
<%
}
%>
</table>       
        </div>
    </body>
</html>
