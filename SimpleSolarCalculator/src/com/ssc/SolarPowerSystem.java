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
	
	public void setPanelAgeEfficiencyLoss(Double input) throws SolarPowerSystemException {
		this.banksOfPanles[DEFAULT_BANK_INDEX].setPanelAgeEfficiencyLoss(input);
	}
	
	public void setPanelLifespan(Integer input) throws SolarPowerSystemException {
		this.otherDetials.setPanelLifespan(input);
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
			   "\n\n< Future Annual Solar Generation >" + this.getFutureOutput() +
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
	
	public Double getAnnualSolarGeneration(Integer year) {
		return this.getAverageDailySolarGeneration() * 365 * 
				this.banksOfPanles[DEFAULT_BANK_INDEX].getPanelEfficiency(year) /
				this.banksOfPanles[DEFAULT_BANK_INDEX].getPanelEfficiency();
	}
	
	public Double getAnnualSavings() {
		return this.getDailySavings() * 365;
	}	
	
	//outdated
	public String getFutureOutput() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n");
		for (int year = 1; year <= this.otherDetials.getPanelLifespan(); year++) {
			sb.append("year ");
			sb.append(year);
			sb.append(" - ");
			sb.append(this.getAnnualSolarGeneration(year).toString().substring(0, 7));			
			sb.append(" kW\n");
		}
					
		return sb.toString();
	}
	
	public String getFutureAnnulSolarGenerationForChartInput() {
		StringBuffer sb = new StringBuffer();
		for (int year = 1; year <= this.otherDetials.getPanelLifespan(); year++) {
			sb.append("['");
			sb.append(year);
			sb.append("',");
			sb.append(this.convertIntoFormat(this.getAnnualSolarGeneration(year)));
			sb.append("]");
			
			if (year < this.otherDetials.getPanelLifespan())
				sb.append(",");
		}
		
		return sb.toString();
	}
	
	public Double getAnnualTariffIncrease() {
		return this.otherDetials.getAnnualTariffIncrease();
	}
	
	public Double getInvestmentReturnRate() {
		return this.otherDetials.getInvestmentReturnRate();
	}
	
	public void setAnnualTariffIncrease(Double input) throws SolarPowerSystemException {
		this.otherDetials.setAnnualTariffIncrease(input);
	}
	
	public void setInvestmentReturnRate(Double input) throws SolarPowerSystemException {
		this.otherDetials.setInvestmentReturnRate(input);
	}
}
