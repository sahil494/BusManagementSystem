

<%@page import="java.util.List"%>
<%@page import="model.driver"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.hibernate.Session"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <style>
            body 
            {
                background-color: black;
            }
             .header 
          {
              height: 100px;
              background-color: black;
              color: white;
            
              
              font-size: 20px;
              width: 600px;
              position: relative;
              left: 330px;
              top: 50px;
              flex-wrap: wrap;
              border: 3px solid white;
          }
         .main
         {
             background-color: grey;
             height: 200px;
             display: flex;
             border: 2px solid black;
             flex-wrap: wrap;
             
         }
         #customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 3px solid black;
    padding: 20px;
}

#customers tr:nth-child(even){background-color: white;}
#customers tr:nth-child(odd){background-color: graytext;}
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
	background-color:#0fcbea;
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
}
         </style>
    </head>
    <body>
        
		<div class="head">
             <b>Driver Records</b>
		</div>
        <div class="cont">
<!--            <table border="3 solid black" id="customers">-->
  <table class="table table-dark table-hover">
<tr>
    <th><B>Driver ID</b></th>
    <th><b>Driver Name</b></th>
    <th><b>Driver Salary</b></th>
    <th><b>Driver Age</b></th>
    <th><b>Licence Number</b></th>
    
</tr>
<%
   List<driver> records =  (List<driver>)request.getAttribute("list");   
   for(driver s: records)
   {

     
%>
<tr>
<td><%=s.getId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getSalary()%></td>
<td><%=s.getAge()%></td>
<td><%=s.getLn()%></td>
</tr>
<%
}
%>
</table>
            
            
        </div>
    </body>
</html>
