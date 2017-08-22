package com.celestine.johnu.reactor;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeTest {

	@Test
	public void testSuccess() {
		assertEquals(1,1);
	}
	
	@Test
	public void testFailure() {
		assertEquals(1,2);
	}

}
