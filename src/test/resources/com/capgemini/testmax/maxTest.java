package com.capgemini.testmax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.max.maximumMain;

public class maxTest {

	maximumMain ob;
	@Before
	public void initialize() {
		ob = new maximumMain();
	}

	@Test
	public void testMax() {
		int ret = ob.findMax(3, 2, 1);
		float rett = ob.findMaxf(34566, 23123, 13123);
		String check = ob.findMaxS("Grape", "Apple", "Banana");
		Assert.assertEquals(3, ret);
		Assert.assertEquals((int) rett, 34566);
		Assert.assertEquals("Grape", check);
	}

	@Test
	public void testMax2() {
		int ret = ob.findMax(2, 3, 1);
		float rett = ob.findMaxf(23123, 34566, 13123);
		String check = ob.findMaxS("Apple", "Grape", "Banana");
		Assert.assertEquals(3, ret);
		Assert.assertEquals((int) rett, 34566);
		Assert.assertEquals("Grape", check);
	}
	@Test
	public void testMax3() {
		int ret = ob.findMax(2, 1, 3);
		float rett = ob.findMaxf(23123, 13123, 34566);
		String check = ob.findMaxS("Apple", "Banana", "Grape");
		Assert.assertEquals(3, ret);
		Assert.assertEquals((int) rett, 34566);
		Assert.assertEquals("Grape", check);
	}
}