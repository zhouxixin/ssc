package com.ssc;

@SuppressWarnings("serial")
public class SolarPowerSystemException extends Exception {
	
	public SolarPowerSystemException() {
		super();
	}
	
	public SolarPowerSystemException(String message) {
		super("Solar Power System Excption: " + message);
		
	}
}