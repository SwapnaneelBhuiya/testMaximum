package com.capgemini.max;


public class maximumMain {

	public <E extends Comparable<E>> E findMax(E ar[]) {
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
}