<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href = "./styles/style.css" rel = "stylesheet" type = "text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Page</title>
</head>
<body>
	<div class = "header">
		<p>
			Header
		</p>
	</div>

	<div class="contentArea">
  	<h1>Result</h1>
  	<div align="left">
  	<pre><code>
  	<% out.print(request.getAttribute("show").toString()); %>
  	</code></pre>
  	</div>
	
	
	
<form name="start over" action="/" method="post">
	<input class="button" type="submit" value="Start Over">
</form>
  
	</div>
	
	<div class = "footer">
		<p>
			Footer
		</p>
	</div>
</body>
</html>