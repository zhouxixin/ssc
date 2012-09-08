<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href = "./styles/style.css" rel = "stylesheet" type = "text/css"/>
<script type="text/javascript" src = "./scripts/display.js"></script>
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
  	
  	 
  	
  	 
  	 
  	<table class="resultTable">
  	
  		<tr>
  			<th><a id="overviewTag" href="javascript:showDIV('overview','overviewTag');">Overview</a></th>
  			<th><a id="electricityGenerationTag" href="javascript:showDIV('electricityGeneration','electricityGenerationTag');">Electricity Generation</a></th>
  			<th><a id="savingsTag" href="javascript:showDIV('savings','savingsTag');">Savings</a></th>
  			<th><a id="returnOnInvestmentTag" href="javascript:showDIV('returnOnInvestment','returnOnInvestmentTag');">Return on Investment</a></th>  			
  		</tr>
  		
  		<tr>
  			<td colspan="4"> 
  			<div id="overview">OOO</div>
  			<div id="electricityGeneration">EEE</div>
  			<div id="savings">SSS</div>
  			<div id="returnOnInvestment">RRR</div>
  			
  			</td>
  		</tr>
  	
  	</table>
  	
  	<div id="hehe">hehe</div>
  	
  	<div id="gaga">gaga</div>
  	
  	<div><% out.print(request.getAttribute("show").toString()); %></div>
  			
  			 
  			<div id="haha" align="left">
  				<pre>
  				<code>
  				<% out.print(request.getAttribute("show").toString()); %>
  				</code>
  				</pre>  	
  			</div>
  	
  	<div><a href="javascript:hideDIVs();">byebye</a></div>
  	
  	<div id="headerDiv">
     <div id="titleText">Hide/Show Div Demo - Click here ==)</div><a id="myHeader" href="javascript:toggle2('myContent','myHeader');" >collapse</a>
	</div>
	<div style="clear:both;"></div>
	<div id="contentDiv">
     <div id="myContent" style="display: block;">This is the content that is dynamically being collapsed.</div>
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