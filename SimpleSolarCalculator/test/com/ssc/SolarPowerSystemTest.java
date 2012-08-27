/**
 * 
 */
package com.ssc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Zhou
 *
 */
public class SolarPowerSystemTest {
	
	private SolarPowerSystem sps;
	private final String r = "";

	/**
	 * @throws java.lang.Exception
	 */
	@Before@Test
	public void setUp() throws Exception {
		sps = new SolarPowerSystem();
		sps.setSystemSize(4.95);
        sps.setPercentagesOnOrientations(0.381, 0.619);
        sps.setEfficiencyLossNorthRoof(0.05);
        sps.setEfficiencyLossWestRoof(0.15);
        sps.setPanelEfficiency(1.0);			
        sps.setInverterEfficiency(0.96);		
        sps.setAverageDailyHoursOfSunlight(4.5);
        sps.setDayTimeHourlyUsage(1.0);
        sps.setElectricityRate(0.1941);
        sps.setFeedInFee(0.50);
        sps.setSystemCost(18000.0);
        sps.setPanelAgeEfficiencyLoss(0.007);
        sps.setPanelLifespan(25);
        sps.setAnnualTariffIncrease(0.05);
        sps.setInvestmentReturnRate(0.05);
	}

	

	/**
	 * Test method for {@link com.ssc.SolarPowerSystem#getAverageDailySolarGeneration()}.
	 */
	@Test
	public void testGetAverageDailySolarGeneration() {
		assertEquals(this.r, this.sps.toString());
	}

}
