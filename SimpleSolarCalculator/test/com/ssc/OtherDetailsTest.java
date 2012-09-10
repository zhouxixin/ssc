package com.ssc;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OtherDetailsTest {
	private OtherDetails otherDetails;
	
	private final Integer PANEL_LIFESPAN = 10;
	private final Double AVERAGE_DAILY_HOURS_OF_SUNLIGHT = 3.3;
	private final Double DAY_TIME_HOURLY_USAGE = 3.3;
	private final Double ELECTRICITY_RATE = 0.67;

	@Before
	public void setUp() throws SolarPowerSystemException {
		this.otherDetails = new OtherDetails();
		this.otherDetails.setPanelLifespan(PANEL_LIFESPAN);
		this.otherDetails.setAverageDailyHoursOfSunlight(
				AVERAGE_DAILY_HOURS_OF_SUNLIGHT);
		this.otherDetails.setDayTimeHourlyUsage(DAY_TIME_HOURLY_USAGE);
		this.otherDetails.setElectricityRate(ELECTRICITY_RATE);
	}
	
   /**
	* test setPanelLifespan(Integer input)
	* 
    * 1. valid input
	* 2. 1
	* 3. less than 1
	*/
	@Test
	public void testSetPanelLifespan() 
			throws SolarPowerSystemException {
		this.otherDetails.setPanelLifespan(3);
	}
	
	@Test 
	public void testSetPanelLifespanWithOne() 
			throws SolarPowerSystemException {
		this.otherDetails.setPanelLifespan(1);
	}
	
	@Test (expected = SolarPowerSystemException.class)
	public void testSetPanelLifespanWithLessThanOneInput() 
			throws SolarPowerSystemException {
		this.otherDetails.setPanelLifespan(-3);
	}   
	
	/**
  	* test setAverageDailyHoursOfSunlight(Double input)
  	*  
  	* 1. valid input
  	* 2. 0
	* 3. negative input
	* 4. greater than 24
	* 5. 24 
	*/	
	@Test
	public void testSetAverageDailyHoursOfSunlight() 
			throws SolarPowerSystemException {
		this.otherDetails.setAverageDailyHoursOfSunlight(5.5);
	}
	
	@Test
	public void testSetAverageDailyHoursOfSunlightWithZero() 
			throws SolarPowerSystemException {
		this.otherDetails.setAverageDailyHoursOfSunlight(0.0);
	}
	
	@Test (expected = SolarPowerSystemException.class)
	public void testSetAverageDailyHoursOfSunlightWithNegativeInput() 
			throws SolarPowerSystemException {
		this.otherDetails.setAverageDailyHoursOfSunlight(-5.5);
	}
	
	@Test (expected = SolarPowerSystemException.class)
	public void testSetAverageDailyHoursOfSunlightWithGreaterThanOneInput() 
			throws SolarPowerSystemException {
		this.otherDetails.setAverageDailyHoursOfSunlight(50.0);
	}
	
	@Test 
	public void testSetAverageDailyHoursOfSunlightWithTwentyFour() 
			throws SolarPowerSystemException {
		this.otherDetails.setAverageDailyHoursOfSunlight(24.0);
	}
	
   /**
  	* test setDayTimeHourlyUsage(Double input)
  	*  
  	* 1. valid input
  	* 2. 0
	* 3. negative input	 
	*/	
	@Test
	public void testSetDayTimeHourlyUsage() 
			throws SolarPowerSystemException {
		this.otherDetails.setDayTimeHourlyUsage(4.5);
	}
	
	@Test
	public void testSetDayTimeHourlyUsageWithZero() 
			throws SolarPowerSystemException {
		this.otherDetails.setDayTimeHourlyUsage(0.0);
	}
	
	@Test (expected = SolarPowerSystemException.class)
	public void testSetDayTimeHourlyUsageWithNegativeInput() 
			throws SolarPowerSystemException {
		this.otherDetails.setDayTimeHourlyUsage(-6.5);
	}
	
	/**
  	* test setElectricityRate(Double input)
  	*  
  	* 1. valid input
  	* 2. 0
	* 3. negative input	  
	*/	
	@Test
	public void testSetElectricityRate() 
			throws SolarPowerSystemException {
		this.otherDetails.setElectricityRate(10.0);
	}
	
	@Test (expected = SolarPowerSystemException.class)
	public void testSetElectricityRateWithZero() 
			throws SolarPowerSystemException {
		this.otherDetails.setElectricityRate(0.0);
	}
	
	@Test (expected = SolarPowerSystemException.class)
	public void testSetElectricityRateWithNegativeInput() 
			throws SolarPowerSystemException {
		this.otherDetails.setElectricityRate(-1.0);
	}
	

	
	
	
	
	
	
	
   /**
	* test getPanelLifespan()
	*/
	@Test
	public void testGetPanelLifespan() {
		assertEquals(this.PANEL_LIFESPAN, this.otherDetails.getPanelLifespan());
	}
	
   /**
	* test getAverageDailyHoursOfSunlight()
	*/
	@Test
	public void testGetAverageDailyHoursOfSunlight() {
		assertEquals(this.AVERAGE_DAILY_HOURS_OF_SUNLIGHT, 
				this.otherDetails.getAverageDailyHoursOfSunlight());
	}
	
  /**
	* test getDayTimeHourlyUsage()
	*/
	@Test
	public void testGetDayTimeHourlyUsage() {
		assertEquals(this.DAY_TIME_HOURLY_USAGE, 
				this.otherDetails.getDayTimeHourlyUsage());
	}
	
   /**
	* test getElectricityRate()
	*/
	@Test
	public void testGetElectricityRate() {
		assertEquals(this.ELECTRICITY_RATE, 
				this.otherDetails.getElectricityRate());
	}
	
}
