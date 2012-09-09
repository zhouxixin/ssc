package com.ssc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InverterTest {
	private Inverter inverter;
	
	private final Double INVERTER_EFFICIENCY = 0.9;
	
	@Before
	public void setUp() throws SolarPowerSystemException {
		this.inverter = new Inverter();
		this.inverter.setInverterEfficiency(INVERTER_EFFICIENCY);
	}

	@Test
	public void testSetInverterEfficiency() throws SolarPowerSystemException {
		this.inverter.setInverterEfficiency(0.8);
	}

}
