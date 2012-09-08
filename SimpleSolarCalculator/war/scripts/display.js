function toggle2(showHideDiv, switchTextDiv) {
	var ele = document.getElementById(showHideDiv);
	var text = document.getElementById(switchTextDiv);
	if(ele.style.display == "block") {
    		ele.style.display = "none";
		text.innerHTML = "restore";
  	}
	else {
		ele.style.display = "block";
		text.innerHTML = "collapse";
	}
}

function showDIV(divID,tagID) {
	hideDIVs();
	resetTAGs();
	document.getElementById(divID).style.display = "block";
	document.getElementById(tagID).style.color = "#E6B422";
}

function hideDIVs() {
	var divIDs = ["overview","electricityGeneration","savings","returnOnInvestment"];
	for (var i = 0; i < divIDs.length ; i++){
		document.getElementById(divIDs[i]).style.display = "none";
	}
}

function resetTAGs() {
	var tagIDs = ["overviewTag","electricityGenerationTag","savingsTag","returnOnInvestmentTag"];
	for (var i = 0; i < tagIDs.length ; i++){
		document.getElementById(tagIDs[i]).style.color = "#007b43";
	}
}