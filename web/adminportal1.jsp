<!DOCTYPE html>
<html>
<head>
<title>Admin Panel</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="admincss.css">
<style> 
.head
{
	position: absolute;
	top:-100px;
	left:500px;
	animation-name:ani1;
	animation-duration: 4s;
	animation-fill-mode: forwards;
}
@keyframes ani1
{
	0%
	{
		top: -100px;
	}
	100%
	{
		top: 200px;
	}
}
h1
{
    font-size:40px;
    font-weight: 700;
    letter-spacing: 8px;
    color:white;
    line-height: 20px;
    text-shadow: 0 2px white, 0 3px #777;
    margin: 1em 0 0.5em 0;
}
.container-fluid a {
	color: rgba(0,0,0,0.5);
	font-weight: 700;
	text-shadow: none;
}
</style>
</head>
<body>
<div class="flex-container">
<section class="sidebar text-center">
<ul class="container-fluid">
<li><a href="createadminbus.jsp">Create Bus </a></li>
<li><a href="routeuser.jsp">Create Routes</a></li>
<li><a href="viewBus">View Bus</a></li>
<li><a href="viewRouteServlet">View Routes</a></li>
<li><a href="driverinfo.jsp">Driver Info</a></li>
<li><a href="deleteadmin.jsp">Delete Bus</a></li>
<li><a href="deleteroute.jsp">Delete Routes</a></li>
<li><a href="LogoutServlet">Logout</a></li>
</ul>
</section>
<h1 class="head">Welcome to Admin Portal</h1>
</div>
</body>
</html>