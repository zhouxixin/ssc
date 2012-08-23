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
	private final Double r = 19.664999999999996;
	/**
	 * @throws java.lang.Exception
	 */
	@Before@Test
	public void setUp() throws Exception {
		sps = new SolarPowerSystem();
		sps.setAverageDailyHoursOfSunlight(4.5);
		sps.setEfficiencyLossNorthRoof(0.05);
		sps.setEfficiencyLossWestRoof(0.15);
		sps.setPercentageOnWestRoof(0.30);
		sps.setPercentageOnNorthRoof(0.70);
		sps.setPanelEfficiencye(1);
		sps.setSystemSize(5);
		sps.setInverterEfficiency(0.95);
	}

	

	/**
	 * Test method for {@link com.ssc.SolarPowerSystem#getAverageDailySolarGeneration()}.
	 */
	@Test
	public void testGetAverageDailySolarGeneration() {
		assertEquals(this.r, (Double)this.sps.getAverageDailySolarGeneration());
	}

}
