<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href = "./styles/style.css" rel = "stylesheet" type = "text/css"/>
<script type="text/javascript" src = "./scripts/inputValidation.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Solar Calculator</title>
</head>
<body>
	<div class = "header">
		<p>
			Header
		</p>
	</div>
 <div class="contentArea">
  	<h1>Simple Solar Calculator</h1>
    
	<form name="dataInputForm" class="dataInputForm" action="simplesolarcalculator" method="post" onsubmit="return formValidation()">
		
		<p>v0.01</p>
		<table class="dataTable">
	
		<caption>Please enter details of your system</caption>
		
		
		<tr>
			<th colspan="4">About the Panel</th>
		</tr>
		
		<tr>			
        	<td>System Size (kW)</td>
        	<td><input type="text" name="systemSize" value=""></td>
        	<td>Panel Efficiency (%)</td>
        	<td><input type="text" name="panelEfficiency" value="1.0"></td>        
      	</tr>
      
        <tr>
        	<td>Percentage on North Roof (%)</td>
        	<td><input type="text" name="percentageOnNorthRoof" value="0.381"></td>
        	<td>Percentage on West Roof (%)</td>
        	<td><input type="text" name="percentageOnWestRoof" value="0.619"></td>        
        </tr>
      
      	<tr>
        	<td>Efficiency Loss (North Roof) (%)</td>
        	<td><input type="text" name="efficiencyLossNorthRoof" value="0.05"></td>
       		<td>Efficiency Loss (West Roof) (%)</td>
        	<td><input type="text" name="efficiencyLossWestRoof" value="0.15"></td>        
      	</tr>
      	
      	<tr>
        	<td>Panel Age Efficiency Loss (%)</td>
        	<td><input type="text" name="panelAgeEfficiencyLoss" value="0.007"></td>
       		<td>Panel Lifespan (YEARS)</td>
        	<td><input type="text" name="panelLifespan" value="25"></td>        
      	</tr>
      
      	<tr>
			<th colspan="4">Other Details</th>
		</tr>
      
      	<tr>
        	<td>Inverter Efficiency (%)</td>
        	<td><input type="text" name="inverterEfficiency" value="0.96"></td>
        	<td></td>
        	<td></td>         
      	</tr>
      
      	<tr>
        	<td>Average Daily Hours of Sunlight (H)</td>
        	<td><input type="text" name="averageDailyHoursOfSunlight" value="4.5"></td>
        	<td>DayTimeHourlyUsage (kW)</td>
        	<td><input type="text" name="dayTimeHourlyUsage" value="1"></td>        
      	</tr> 
      	
      	<tr>
        	<td>Electricity Rate (AUD)</td>
        	<td><input type="text" name="electricityRate" value="0.19"></td>
        	<td>Feed In Fee (AUD)</td>
        	<td><input type="text" name="feedInFee" value="0.50"></td>        
      	</tr>  
      	
      	<tr>
        	<td>System Cost (AUD)</td>
        	<td><input type="text" name="systemCost" value="18000"></td>
        	<td></td>
        	<td></td>        
      	</tr>  
      	
    	</table>    	
    	
    	
    	<div class="buttonArea">
    		<input class="button" type="reset" value="Clear Table"><input class="button" id="getResults" type="submit" value="Get Results">
    	</div>	

	</form>
    
	</div>
	<div class = "footer">
		<p>
			Footer
		</p>
	</div>
	

</body>
</html>