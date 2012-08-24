package com.ssc;

import java.text.DecimalFormat;


public class SolarPowerSystem {
	
	private BankOfPanels[] banksOfPanles;
	private BankOfPanels bank0;
	private Inverter inverter;
	private OtherDetails otherDetials;
	private final Integer DEFAULT_NUMBER_OF_BANKS = 1;
	private final Integer DEFAULT_BANK_INDEX = 0;
	/** 
	 * Format for output
	 */
	private final String DecFormat ="#.##";
	//sb.append(new DecimalFormat(NGramContainer.DecFormat).format(this.probabilities[index]));
	
	public SolarPowerSystem() {
		this.banksOfPanles = new BankOfPanels[DEFAULT_NUMBER_OF_BANKS];
		for (int i = 0; i < banksOfPanles.length; i++) {
			banksOfPanles[i] = new BankOfPanels();
		}
		//this.banksOfPanles[0] = new BankOfPanels();
		this.inverter = new Inverter();
		this.otherDetials = new OtherDetails();
	}
	
	public void setSystemSize(Double input) throws SolarPowerSystemException {
		this.banksOfPanles[DEFAULT_BANK_INDEX].setSystemSize(input);
	}
	
	public void setPercentagesOnOrientations(Double north, 
			Double west) throws SolarPowerSystemException {
		this.banksOfPanles[DEFAULT_BANK_INDEX].setPercentagesOnOrientations(north, west);
	}
	
	public void setEfficiencyLossNorthRoof(Double input) throws SolarPowerSystemException {
		this.banksOfPanles[DEFAULT_BANK_INDEX].setEfficiencyLossNorthRoof(input);
	}
	
	public void setEfficiencyLossWestRoof(Double input) throws SolarPowerSystemException {
		this.banksOfPanles[DEFAULT_BANK_INDEX].setEfficiencyLossWestRoof(input);
	}
	
	public void setPanelEfficiency(Double input) throws SolarPowerSystemException {
		this.banksOfPanles[DEFAULT_BANK_INDEX].setPanelEfficiency(input);
	}
	
	public void setInverterEfficiency (Double input) throws SolarPowerSystemException {
		this.inverter.setInverterEfficiency(input);
	}
	
	public void setAverageDailyHoursOfSunlight(Double input) throws SolarPowerSystemException {
		this.otherDetials.setAverageDailyHoursOfSunlight(input);
	}
	
	public void setDayTimeHourlyUsage(Double input) throws SolarPowerSystemException {
		this.otherDetials.setDayTimeHourlyUsage(input);
	}
	
	public void setElectricityRate(Double input) throws SolarPowerSystemException {
		this.otherDetials.setElectricityRate(input);
	}
	
	public void setFeedInFee(Double input) throws SolarPowerSystemException {
		this.otherDetials.setFeedInFee(input);
	}				
				
	public void setSystemCost(Double input) throws SolarPowerSystemException {
		this.otherDetials.setSystemCost(input);			
	}
	
	public String toString() {		
		return "\n< Solar Power System >" +
			   this.banksOfPanles[DEFAULT_BANK_INDEX].toString() +
			   this.inverter.toString() +  this.otherDetials.toString() +
			   "\n< Calculation Results >" + 
			   "\nAverage Daily Solar Generation:\t" +
			   convertIntoFormat(this.getAverageDailySolarGeneration()) + " kWh" +
			   "\nReplacement Generation:\t\t" +
			   convertIntoFormat(this.getReplacementGeneration()) + " kWh" +
			   "\nExported Generation:\t\t" +
			   convertIntoFormat(this.getExportedGeneration()) + " kWh" +
			   "\nDaily Savings:\t\t\t" +
			   convertIntoFormat(this.getDailySavings()) + " AUD" +
			   "\nAnnual Solar Generation:\t" +
			   convertIntoFormat(this.getAnnualSolarGeneration()) + " kWh" +
			   "\nAnnual Savings:\t\t\t" +
			   convertIntoFormat(this.getAnnualSavings()) + " AUD" +
			   "\n";		
	}
	
	private String convertIntoFormat(Double input) {		
		return new DecimalFormat(this.DecFormat).format(input);
	}
	
	public Double getAverageDailySolarGeneration() {
		return this.inverter.getOutput(banksOfPanles[DEFAULT_BANK_INDEX]) * 
				this.otherDetials.getAverageDailyHoursOfSunlight();
	}
	
	public Double getReplacementGeneration() {
		return this.otherDetials.getDayTimeHourlyUsage() * 
				this.otherDetials.getAverageDailyHoursOfSunlight();
	}
	
	public Double getExportedGeneration() {
		return this.getAverageDailySolarGeneration() -
				this.getReplacementGeneration();
	}
	
	public Double getDailySavings() {
		return this.getReplacementGeneration() * 
				this.otherDetials.getElectricityRate() +
				this.getExportedGeneration() *
				this.otherDetials.getFeedInFee();
	}
	
	public Double getAnnualSolarGeneration() {
		return this.getAverageDailySolarGeneration() * 365;
	}
	
	public Double getAnnualSavings() {
		return this.getDailySavings() * 365;
	}
}
