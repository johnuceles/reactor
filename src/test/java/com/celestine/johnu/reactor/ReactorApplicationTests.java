package com.celestine.johnu.reactor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReactorApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testSuccess() {
		assertEquals(1,1);
	}
	
	@Test
	public void testFailure() {
		assertEquals(1,2);
	}

}
