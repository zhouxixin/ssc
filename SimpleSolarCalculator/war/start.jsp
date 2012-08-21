<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href = "./styles/style.css" rel = "stylesheet" type = "text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Solar Calculator</title>
</head>
<body>
 <div class="contentArea">
  	<h1>Simple Solar Calculator</h1>
    
	<form action="simplesolarcalculator" method="post">
		<table border="1">
	
		<caption>Please enter your installation details (new JSP)</caption>
		
		<tr>
        	<td>System Size (KW)</td>
        	<td><input type="text" name="systemSize"></td>        
        </tr>
      
        <tr>
        	<td>Percentage on North Roof</td>
        	<td><input type="text" name="percentageOnNorthRoof"></td>        
        </tr>
      
        <tr>
        	<td>Percentage on West Roof</td>
        	<td><input type="text" name="percentageOnWestRoof"></td>        
        </tr>
      
      	<tr>
        	<td>Efficiency Loss (North Roof)</td>
        	<td><input type="text" name="efficiencyLossNorthRoof"></td>        
      	</tr>
      
      	<tr>
       		<td>Efficiency Loss (West Roof)</td>
        	<td><input type="text" name="efficiencyLossWestRoof"></td>        
      	</tr>
      
      	<tr>
        	<td>Panel Efficiency</td>
        	<td><input type="text" name="panelEfficiency"></td>        
      	</tr>
      
      	<tr>
        	<td>Inverter Efficiency</td>
        	<td><input type="text" name="inverterEfficiency"></td>        
      	</tr>
      
      	<tr>
        	<td>Average Daily Hours of Sunlight</td>
        	<td><input type="text" name="averageDailyHoursOfSunlight"></td>        
      	</tr> 
      	
    	</table>
    	
    	<div class="buttonArea">
    		<input type="reset" value="Clear Table"><input type="submit" value="Get Results">
    	</div>	

	</form>
    
	</div>

</body>
</html>