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
	public void testMax()
	{
		int ret=ob.findMax(3,2,1);
		Assert.assertEquals(3,ret);
	}
//	@Test
//	public void testMax2()
//	{
//		int ret=ob.findMax(2,3,1);
//		Assert.assertEquals(3,ret);
//	}
}
