package com.ssc;

public class Inverter {
	
	private Double inverterEfficiency; // percentage in decimal form
		
	public Inverter() {
		
	}
	
	public void setInverterEfficiency (Double input) throws SolarPowerSystemException {
		if (input < 0.0 || input > 1.0) {
			throw new SolarPowerSystemException("Inverter Efficiency " +
												"should be valid percentage.");
		} else {
			this.inverterEfficiency = input;
		}
	}
	
	public Double getOutput(BankOfPanels b) {
		return b.getOutput() * this.inverterEfficiency;
	}
	
	public Double getOutput(Double input) {
		return input * this.inverterEfficiency;
	}
	
	@Override
	public String toString() {		
		return "\n< Inverter >" +
			   "\nInverter Efficiency:\t\t" +  this.inverterEfficiency +			   
			   "\n";		
	}

}
