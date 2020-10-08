package com.capgemini.max;


public class maximumMain <X extends Comparable<X>,Y extends Comparable<Y>,Z extends Comparable<Z>>{

	X ar1[];Y ar2[]; Z ar3[];
	public maximumMain(X a[],Y b[], Z c[])
	{
		ar1=a;ar2=b;ar3=c;
	}
	public static <E extends Comparable<E>> E findMax(E[] ar) {
		E max = ar[0];
		for(E i:ar)
		{
			if (i.compareTo(max)>0)
				max = i;
			if (i.compareTo(max)>0)
				max = i;
		}
		return max;
	}
	public void testMaximum()
	{
		Integer a=(Integer) findMax(ar1);
		Double b=(Double) findMax(ar2);
		String c=(String) findMax(ar3);
	}
}