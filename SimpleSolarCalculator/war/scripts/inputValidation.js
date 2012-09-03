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
	if (!isValidDecimal(dataInputForm.panelEfficiency))	numberOfErrors += 1;	
	if (!isValidDecimal(dataInputForm.percentageOnNorthRoof)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.percentageOnWestRoof)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.efficiencyLossNorthRoof))	numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.efficiencyLossWestRoof)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.inverterEfficiency)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.averageDailyHoursOfSunlight))	numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.dayTimeHourlyUsage)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.electricityRate))	numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.feedInFee)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.systemCost)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.panelAgeEfficiencyLoss)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.panelLifespan)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.annualTariffIncrease)) numberOfErrors += 1;
	if (!isValidDecimal(dataInputForm.investmentReturnRate)) numberOfErrors += 1;
		
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
	if (fieldName.value > 0) {		
		return true;
	} else {
		return false;
	}
}

function isValidDecimal(fieldName) {
	if (!isMissing(fieldName) && isNumeric(fieldName) && isPositive(fieldName)) {
		fieldName.style.border = "thin dotted #007b43";
		return true;
	} else {
		fieldName.style.border = "thin solid #E2041B";
		return false;
	}	
}

/*
String.prototype.trim = function() {
    return this.replace(/^\s+|\s+$/g, "");
}
*/
