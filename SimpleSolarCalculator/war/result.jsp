<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%! 
  	String someOutput() {
  		String s = "['3',  8,  23],['4',12,45]";
        return s;
    }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href = "./styles/style.css" rel = "stylesheet" type = "text/css"/>
<script type="text/javascript" src = "./scripts/display.js"></script>

<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawAnnualGenerationChart);
      google.setOnLoadCallback(drawSavingsChart);
      google.setOnLoadCallback(drawReturnonInvestmentChart);
      
      function drawAnnualGenerationChart() {
        var data = google.visualization.arrayToDataTable([
          ['year', 'Annual Solar Generation (kWh)'],          
          <% out.print(request.getAttribute("futureAnnulGeneration").toString()); %>
        ]);

        var options = {
          title: 'Annual Solar Generation (kWh):',
          titleTextStyle: {color: '#E6B422'},
          width:750, height:350,
          hAxis: {title: 'year', titleTextStyle: {color: '#007b43'}},          
          colors: ['#007b43','#E6B422','#E2041B']          
        };

        var chart = new google.visualization.ColumnChart(document.getElementById('generationChartDiv'));
        chart.draw(data, options);
      }
      
      function drawSavingsChart() {
          var data = google.visualization.arrayToDataTable([
            ['year', 'Annual Savings (AUD)'],
            <% out.print(request.getAttribute("futureAnnulSavings").toString()); %>                        
          ]);

          var options = {
            title: 'Annual Savings (AUD):',
            titleTextStyle: {color: '#E6B422'},
            width:750, height:350,
            hAxis: {title: 'year', titleTextStyle: {color: '#007b43'}},          
            colors: ['#007b43','#E6B422','#E2041B']          
          };

          var chart = new google.visualization.ColumnChart(document.getElementById('savingsChartDiv'));
          chart.draw(data, options);
        }
      
      function drawReturnonInvestmentChart() {
          var data = google.visualization.arrayToDataTable([
            ['year', 'Cumulative Annual Savings (AUD)', 'Compound Investment Return (AUD)', 'Cumulative Income (AUD)'],
            <% out.print(request.getAttribute("returnOnInvestment").toString()); %>                        
          ]);

          var options = {
            title: 'Return on Investment (AUD):',
            titleTextStyle: {color: '#E6B422'},
            width:750, height:350,
            hAxis: {title: 'year', titleTextStyle: {color: '#007b43'}},          
            colors: ['#007b43','#E6B422','#E2041B']          
          };

          var chart = new google.visualization.ColumnChart(document.getElementById('returnChartDiv'));
          chart.draw(data, options);
        }
      
    </script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Page</title>
</head>
<body onload="javascript:showDIV('overview','overviewTag');">
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
  			<div id="overview">  				
  				<table>
  				<!--
  					<tr>
  						<th style="text-align:left;" colspan="5">Summary</th>
  					</tr>
  					
  				-->
  					<tr>
  						
  						<td>Average Daily Solar Generation</td>
  						<td><% out.print(request.getAttribute("dailyGeneration").toString()); %>&nbsp;kWh</td>
  						<td>Average Daily Savings</td>
  						<td>23</td>
  						
  					</tr>
  					<tr>
  						
  						<td>Pay-Back time</td>
  						<td><% out.print(request.getAttribute("payBackTime").toString()); %>&nbsp;YEARS</td>
  						<td>ASavings</td>
  						<td>23tt</td>
  						
  					</tr>
  					<tr></tr>
  					<tr></tr>
  					<tr></tr>
  				</table>
  			
  			</div>
  			
  			<div id="electricityGeneration">  			
  				<div id="generationChartDiv"></div>  			
  			</div>
  			  			 			
  			<div id="savings">
  				<div id="savingsChartDiv"></div>
  			</div>
  			
  			<div id="returnOnInvestment">
  				<div id="returnChartDiv"></div>
  			
  			</div>
  			
  			</td>
  		</tr>
  	
  	</table>	
<!--  

<div id="haha" align="left">
  				<pre>
  				<code>
  				<% out.print(request.getAttribute("show").toString()); %>
  				</code>
  				</pre>  	
  			</div>

-->
  			

<form name="start over" action="/" method="post">
	<div class="buttonArea">
	<input class="button" type="submit" value="Start Over">
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