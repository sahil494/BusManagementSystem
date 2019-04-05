<!DOCTYPE html>
<html>
<head>
<title>User Panel</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="user1.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
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
    <li><a href="user.jsp">Home</a></li>
    <li><a href="scheduleuser.jsp">Schedule</a></li>
    <li><a href="viewRouteServlet">Routes</a></li>
    <li><a href="LogoutUser">Logout</a></li>
    </ul>
    </section>
    <section class="main text-center">
    <section class="container text-center">
    <h1 class="page-heading">Search</h1>
    <form name="MyForm" action="userServlet1" method="post" onsubmit="return myValidation()">
    <div id="basic">
    <input class="form-control" type="text" name="search" placeholder="Route-Name">
    </div>
    </form>
    </section>
    </section>
    </div>
    <script>
	function myValidation()
	{
		var value = document.forms["MyForm"]["search"].value;
		var flag=true;
		if (value=="")
		{
			alert("Route-Code cannot be empty");
			flag=false;
		}
		return flag;
	}
	</script>
    </body>
    </html>