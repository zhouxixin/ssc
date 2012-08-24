package com.ssc;

public class OtherDetails {
	
	private Double averageDailyHoursOfSunlight; // average daily hours of sun light in hours
	
	//private Double dailyAverageUsage;  // daily average usage in kWh
	private Double dayTimeHourlyUsage; // day time hourly usage in kWh
	
	//private Double tariff11Fee;		   // in AUD
	private Double electricityRate;    // electricity rate in AUD
	private Double feedInFee;		   // feed in fee in AUD
	
	private Double systemCost;		   // system cost in AUD
	
	public OtherDetails() {
		
	}
	
	public void setAverageDailyHoursOfSunlight(Double input) throws SolarPowerSystemException {
		if (input < 0.0 || input > 24.0) {
			throw new SolarPowerSystemException("Dverage daily hours of sun light" +
												"should be between 0 and 24 hours."); 
		} else {
			this.averageDailyHoursOfSunlight = input;
		}
	}
	
	/*
	public void setDailyAverageUsage(Double input) throws SolarPowerSystemException {
		if (input < 0.0) {
			throw new SolarPowerSystemException("Daily average usage" +
												"should be equal to or greater than 0");
		} else {
			this.dailyAverageUsage = input;
		}
		
	}
	*/
	
	public void setDayTimeHourlyUsage(Double input) throws SolarPowerSystemException {
		if (input < 0.0) {
			throw new SolarPowerSystemException("Day time hourly usage" +
												"should be equal to or greater than 0");
		} else {
			this.dayTimeHourlyUsage = input;
		}
		
	}
		
	public void setElectricityRate(Double input) throws SolarPowerSystemException {
		if (input <= 0.0) {
			throw new SolarPowerSystemException("Electricity rate" +
												"should be greater than 0");
		} else {
			this.electricityRate = input;
		}
		
	}
	
	public void setFeedInFee(Double input) throws SolarPowerSystemException {
		if (input <= 0.0) {
			throw new SolarPowerSystemException("Feed in fee" +
												"should be greater than 0");
		} else {
			this.feedInFee = input;
		}
		
	}
	
	public void setSystemCost(Double input) throws SolarPowerSystemException {
		if (input <= 0.0) {
			throw new SolarPowerSystemException("System cost" +
												"should be greater than 0");
		} else {
			this.systemCost = input;
		}
		
	}
	
	public Double getAverageDailyHoursOfSunlight() {
		return this.averageDailyHoursOfSunlight;
	}
	
	public Double getDayTimeHourlyUsage() {
		return this.dayTimeHourlyUsage;
	}
	
	public Double getElectricityRate() {
		return this.electricityRate;
	}
	
	public Double getFeedInFee() {
		return this.feedInFee;
	}
	
	public Double getSystemCost() {
		return this.systemCost;
	}
	
	@Override
	public String toString() {		
		return "\n< Other Details >" +
			   "\nAverage Daily Hours Of Sunlight:" +  this.getAverageDailyHoursOfSunlight() +
			   "\nDay Time Hourly Usage:\t\t" + this.getDayTimeHourlyUsage() +
			   "\nElectricity Rate:\t\t" + this.getElectricityRate() +
			   "\nFeed In Fee:\t\t\t" + this.getFeedInFee() +
			   "\nSystem Cost:\t\t\t" + this.getSystemCost() +			   
			   "\n";		
	}
}