package com.capgemini.max;

public class maximumMain {

	public int findMax(int i, int j, int k) {
		int max=i;
		if(j>max)
			max=j;
		if(k>max)
			max=k;
		return max;
	}

}
