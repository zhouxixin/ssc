//var numberOfErrors;

function formValidationOld() {
	
	/*
	var allGood = true;
	
	var dataFields = ["dataInputForm.systemSize"];
	alert("hey wait");
	for (var fieldName in dataFields) {
		
		if(!isValid(fieldName)) {
			allGood = false;
		}
	}
	
	if (!isValid(dataInputForm.systemSize) {
		allGood = flase;
	}
	
	return allGood;
	
	
	
	*/
	
	/* Working version */
	if (!isValidDecimal(dataInputForm.systemSize) ||
			!isValidDecimal(dataInputForm.panelEfficiency) ||
			!isValidDecimal(dataInputForm.percentageOnNorthRoof) ||
			!isValidDecimal(dataInputForm.percentageOnWestRoof) ||
			!isValidDecimal(dataInputForm.efficiencyLossNorthRoof) ||
			!isValidDecimal(dataInputForm.efficiencyLossWestRoof) ||
			!isValidDecimal(dataInputForm.inverterEfficiency) ||
			!isValidDecimal(dataInputForm.averageDailyHoursOfSunlight) ||
			!isValidDecimal(dataInputForm.dayTimeHourlyUsage) ||
			!isValidDecimal(dataInputForm.electricityRate) ||
			!isValidDecimal(dataInputForm.feedInFee) ||
			!isValidDecimal(dataInputForm.systemCost) ||
			!isValidDecimal(dataInputForm.panelAgeEfficiencyLoss) ||
			!isValidDecimal(dataInputForm.panelLifespan) ||
			!isValidDecimal(dataInputForm.annualTariffIncrease) ||
			!isValidDecimal(dataInputForm.investmentReturnRate)) {
		//alert("hey wait");		
		return false;		
	} else {
		return true;
	}
	
	
		
	
	/*
	alert("Cool! Submitted successfully.");
	
    if (AllGood()){ 
		alert("Cool! Submitted successfully.");
		return true; 
	} else {		
		return false; 
	}*/
}

function testReturn() { return false; }

function formValidation() {
	
	var numberOfErrors = 0;
	
	if (!isValidDecimal(dataInputForm.systemSize)) numberOfErrors += 1;
	if (!isValidPercentage(dataInputForm.panelEfficiency)) numberOfErrors += 1;
	
		
	if (!isValidPercentage(dataInputForm.percentageOnNorthRoof)) numberOfErrors += 1;
	if (!isValidPercentage(dataInputForm.percentageOnWestRoof)) numberOfErrors += 1;
	
	if (!isValidOrientationSet(dataInputForm.percentageOnNorthRoof, dataInputForm.percentageOnWestRoof)) numberOfErrors += 1;
	
	if (!isValidPercentage(dataInputForm.efficiencyLossNorthRoof))	numberOfErrors += 1;
	if (!isValidPercentage(dataInputForm.efficiencyLossWestRoof)) numberOfErrors += 1;
	if (!isValidPercentage(dataInputForm.inverterEfficiency)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.averageDailyHoursOfSunlight))	numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.dayTimeHourlyUsage)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.electricityRate))	numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.feedInFee)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.systemCost)) numberOfErrors += 1;
	if (!isValidPercentage(dataInputForm.panelAgeEfficiencyLoss)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.panelLifespan)) numberOfErrors += 1;
	if (!isValidPercentage(dataInputForm.annualTariffIncrease)) numberOfErrors += 1;
	if (!isValidPercentage(dataInputForm.investmentReturnRate)) numberOfErrors += 1;
		
	return (numberOfErrors == 0);	
}

function isMissing(fieldName) {	
	if (fieldName.value.trim() == "" || fieldName.value == null) {		
		return true;
	} else {
		return false;
	}
}

function isNumeric(fieldName) {
	if (!isNaN(fieldName.value)) {		
		return true;
	} else {
		return false;
	}
}

function isPositive(fieldName) {
	if (fieldName.value >= 0) {		
		return true;
	} else {
		return false;
	}
}

function isValidDecimal(fieldName) {
	if (!isMissing(fieldName) && isNumeric(fieldName) && isPositive(fieldName)) {
		fieldName.style.border = "thin solid #007b43";
		return true;
	} else {
		fieldName.style.border = "thin solid #E2041B";
		document.getElementById("info").innerHTML = "Please check for errors";
		document.getElementById("info").style.color = "#E2041B";
		return false;
	}	
}

function isValidPercentage(fieldName) {
	if (isValidDecimal(fieldName) && fieldName.value <= 100.0) {
		fieldName.style.border = "thin solid #007b43";
		return true;
	} else {
		fieldName.style.border = "thin solid #E2041B";
		document.getElementById("info").innerHTML = "Please check for errors";
		document.getElementById("info").style.color = "#E2041B";
		return false;
	}
}

function isValidOrientationSet(fieldName1, fieldName2) {
	var sum = Number(fieldName1.value) + Number(fieldName2.value);
	if (sum == 100.0) {
		return true;
	} else {
		fieldName1.style.border = "thin solid #E2041B";
		fieldName2.style.border = "thin solid #E2041B";
		document.getElementById("info").innerHTML = "Please check for errors";
		document.getElementById("info").style.color = "#E2041B";			
		return false;
	}
	
}

function resetTable() {
	var list = document.getElementsByClassName("dataInput");
	
	document.getElementById("info").innerHTML = "Please enter details of your system";
	document.getElementById("info").style.color = "#E6B422";
	
	for (var i = 0; i < list.length; i++) {
	    //list[i].value = "";
	    list[i].style.border = "thin dotted #007b43";
	}
}

/*
String.prototype.trim = function() {
    return this.replace(/^\s+|\s+$/g, "");
}
*/
