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
	@Test
	public void testMax() {
		Integer a1[]= {3,2,1};
		Double b1[]= {34566.01, 23123.02, 13123.03};
		String c1[]={"Grape", "Apple", "Banana"};
		maximumMain obj=new maximumMain<Integer,Double,String>(a1,b1,c1);
	}

	@Test
	public void testMax2() {
		Integer a1[]= {2,3,1};
		Double b1[]= {23123.02,34566.01, 13123.03};
		String c1[]={"Apple","Grape", "Banana"};
		maximumMain obj=new maximumMain<Integer,Double,String>(a1,b1,c1);
	}
	@Test
	public void testMax3() {
		Integer a1[]= {2,1,3};
		Double b1[]= {23123.02, 13123.03,34566.01};
		String c1[]={"Apple", "Banana","Grape"};
		maximumMain obj=new maximumMain<Integer,Double,String>(a1,b1,c1);
	}
	@Test
	public void testMaxi()
	{
		ob.testMaximum();
	}
}