package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.checkoutProcess.Validator;

public class TestPromotions {

	@Test
	public void TestHappyCaes() {
		/*
		 * Scenario A 
		 * 1 * A = 50 
		 * 1 * B = 30 
		 * 1 * C = 20
		 */
		
		Validator caller = new Validator();
		int actualResult =caller.calculatePromotionValue(1, 1, 1, 0);
		int expectedResult= 100;
		Assert.assertEquals("Expected value is " + expectedResult + "But fount "+ actualResult,actualResult, expectedResult);
	
	}
	
	@Test
	public void TestWithMultipleValues() {
		/*
		 * Scenario B 
		 * 5 * A => 130 + 2*50 
		 * 5 * B =>45 + 45 + 30 
		 * 1 * C =>20 
		 * Total 370
		 */
		
		Validator caller = new Validator();
		int actualResult =caller.calculatePromotionValue(5, 5, 1, 0);
		int expectedResult= 370;
		Assert.assertEquals("Expected value is " + expectedResult + "But fount "+ actualResult,actualResult, expectedResult);
	}
	
	@Test
	public void TestWithcombinations() {
		/*
		 * Scenario C
			3 * A => 130
			5 * B => 45 + 45 + 1 * 30
			1 * C => 0
			1 * D => 30
			
			Total => 280
		 */
		
		Validator caller = new Validator();
		int actualResult =caller.calculatePromotionValue(3, 5, 1, 1);
		int expectedResult= 280;
		Assert.assertEquals("Expected value is " + expectedResult + "But fount "+ actualResult,actualResult, expectedResult);
	}
	
}
