package com.capgemini.max;

public class maximumMain {

	public int findMax(int i, int j, int k) {
		int max = i;
		if (j > max)
			max = j;
		if (k > max)
			max = k;
		return max;
	}

	public float findMaxf(float d, float e, float f) {
		float max = d;
		if (e > max)
			max = e;
		if (f > max)
			max = f;
		return max;
	}

}
