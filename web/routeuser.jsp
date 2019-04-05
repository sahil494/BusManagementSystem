<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Route user</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
    <link rel="stylesheet" href="https://unpkg.com/bulma@0.7.4/css/bulma.min.css" />
    <link rel="stylesheet" type="text/css" href="login.css">
    <style>
        .hero.is-success {
         background: url("v3.jpg") no-repeat;
         background-size: cover;
}
.cont
{
    text-align:center;
    position:absolute;
    top:2%;
    left:50%;
    transform:translate(-50%,-50%);
    width:120%;
}
.cont span
{
    color:white;
    text-transform: uppercase;
    display:block;
}
.text1
{
    font-size:60px;
    font-weight: 700;
    letter-spacing: 8px;
    margin-bottom: 41px;
    position: relative;
    animation: text 3s 1;
    background-color:rgba(0,0,0,0.4);
}
@keyframes text
{
    0%
    {
        color:black;
        margin-bottom:-40px;
    }
    30%
    {
        letter-spacing:25px;
        margin-bottom:-40px;
    }
    85%
    {
        letter-spacing:8px;
        margin-bottom: -40px;
    }
}
.box {
  margin-top: 5rem;
  border-radius:15px;
  background-color:rgba(192,192,192,0.3);
}
    </style>
</head>
<body>
    <section class="hero is-success is-fullheight">
        <div class="hero-body">
            <div class="container has-text-centered">
                <div class="column is-4 is-offset-4">
                    <div class="cont">
                        <span class="text1">Create Routes</span>
                    </div>
                    <div class="box">
                        <form name="MyForm" action="routeServlet" method="post" onsubmit="return myValidation()">
                            <div class="field">
                                <div class="control">
                                    <input class="input is-large" type="text" placeholder="Route Code" name="rc">
                                </div>
                            </div>
                            <div class="field">
                                <div class="control">
                                    <input class="input is-large" type="text" placeholder="Route Name" name="rn">
                                </div>
                            </div>
                            <div class="field">
                                <div class="control">
                                    <input class="input is-large" type="text" placeholder="Pick-Up Points" name="pp">
                                </div>
                            </div>
                            <div class="field">
                                <div class="control">
                                    <input class="input is-large" type="text" placeholder="Driver Name" name="dn">
                                </div>
                            </div>
                            <div class="field">
                                <div class="control">
                                    <input class="input is-large" type="text" placeholder="Destination" name="des">
                                </div>
                            </div>
                            <div class="field">
                                <div class="control">
                                    <input class="input is-large" type="text" placeholder="Time" name="time">
                                </div>
                            </div>
                            <br>
                            <button class="button is-block is-info is-large is-fullwidth">Create</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <script async type="text/javascript" src="bulma.js"></script>
     <script>
	function myValidation()
	{
		var value = document.forms["MyForm"]["rc"].value;
		var value2 = document.forms["MyForm"]["rn"].value;
                var value3 = document.forms["MyForm"]["pp"].value;
                var value4 = document.forms["MyForm"]["dn"].value;
                var value5 = document.forms["MyForm"]["des"].value;
                var value6 = document.forms["MyForm"]["time"].value;
		var flag=true;
		if (value=="")
		{
			alert("Route Code cannot be empty");
			flag=false;
		}
		if (value2=="")
		{
			alert("Route Name cannot be empty");
			flag=false;
		}
                if (value3=="")
		{
			alert("Pick-Up Point cannot be empty");
			flag=false;
		}
                if (value4=="")
		{
			alert("Driver Name cannot be empty");
			flag=false;
		}
                if (value5=="")
		{
			alert("Destination cannot be empty");
			flag=false;
		}
                if (value6=="")
		{
			alert("Time cannot be empty");
			flag=false;
		}
		return flag;
	}
	</script>
</body>
</html>