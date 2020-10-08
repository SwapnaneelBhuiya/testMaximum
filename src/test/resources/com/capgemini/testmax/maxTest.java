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
		Integer a[]= {3,2,1};
		Double b[]= {34566.01, 23123.02, 13123.03};
		String c[]={"Grape", "Apple", "Banana"};
		Integer ret=ob.findMax(a);
		Double checkD=ob.findMax(b);
		String checkS=ob.findMax(c);
		Assert.assertEquals(3, ret.intValue());
		Assert.assertEquals((double)34566.01, checkD.doubleValue(),0.0);
		Assert.assertEquals("Grape", checkS);
	}

	@Test
	public void testMax2() {
		Integer a[]= {2,3,1};
		Double b[]= {23123.02,34566.01, 13123.03};
		String c[]={"Apple","Grape", "Banana"};
		Integer ret=ob.findMax(a);
		Double checkD=ob.findMax(b);
		String checkS=ob.findMax(c);
		Assert.assertEquals(3, ret.intValue());
		Assert.assertEquals((double)34566.01, checkD.doubleValue(),0.0);
		Assert.assertEquals("Grape", checkS);
	}
	@Test
	public void testMax3() {
		Integer a[]= {2,1,3};
		Double b[]= {23123.02, 13123.03,34566.01};
		String c[]={"Apple", "Banana","Grape"};
		Integer ret=ob.findMax(a);
		Double checkD=ob.findMax(b);
		String checkS=ob.findMax(c);
		Assert.assertEquals(3, ret.intValue());
		Assert.assertEquals((double)34566.01, checkD.doubleValue(),0.0);
		Assert.assertEquals("Grape", checkS);
	}
}