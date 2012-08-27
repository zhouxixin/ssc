function formValidation() {
	var ss = document.dataInputForm.systemSize.value;
	if (ss.length == 0) {
		alert("hey hey hey");
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

function AllGood() {
	var ss = document.dataInputForm.systemsize.value;
	if (ss.length == 0)
		return true;
	else
		return false;
}