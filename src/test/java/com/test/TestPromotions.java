package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.checkoutProcess.Validator;

public class TestPromotions {

	@Test
	public void LoginTest() {
		/*
		 * Scenario A 
		 * 1 * A = 50 
		 * 1 * B = 30 
		 * 1 * C = 20
		 */
		Validator caller = new Validator();
		Assert.assertEquals(caller.calculatePromotionValue(1, 1, 1, 0), 100);
	}

}
