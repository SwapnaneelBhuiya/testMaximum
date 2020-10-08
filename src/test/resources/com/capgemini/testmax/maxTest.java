package com.capgemini.testmax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.max.maximumMain;

public class maxTest {

	maximumMain ob;
	public Integer a[]= {3,2,1};
	public Double b[]= {34566.01, 23123.02, 13123.03};
	public String c[]={"Grape", "Apple", "Banana"};
	@Before
	public void initialize() {
		ob = new maximumMain<Integer,Double,String>(a,b,c);
	}
//	@Test
//	public void testMax() {
//		Assert.assertEquals(3, ret.intValue());
//		Assert.assertEquals((double)34566.01, checkD.doubleValue(),0.0);
//		Assert.assertEquals("Grape", checkS);
//	}
//
//	@Test
//	public void testMax2() {
//		Assert.assertEquals(3, ret.intValue());
//		Assert.assertEquals((double)34566.01, checkD.doubleValue(),0.0);
//		Assert.assertEquals("Grape", checkS);
//	}
//	@Test
//	public void testMax3() {
//		Assert.assertEquals(3, ret.intValue());
//		Assert.assertEquals((double)34566.01, checkD.doubleValue(),0.0);
//		Assert.assertEquals("Grape", checkS);
//	}
	@Test
	public void testMaxi()
	{
		ob.testMaximum();
	}
}