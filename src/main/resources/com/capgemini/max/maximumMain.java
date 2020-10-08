package com.capgemini.max;

import java.util.Arrays;

public class maximumMain <X extends Comparable<X>,Y extends Comparable<Y>,Z extends Comparable<Z>>{

	X ar1[];
	Y ar2[];
	Z ar3[];

	public maximumMain(X a[], Y b[], Z c[]) {
		ar1 = a;
		ar2 = b;
		ar3 = c;
	}

	public static <E extends Comparable<E>> void findMax(E... options) {
		E max = options[0];
		for (E i : options) {
			if (i.compareTo(max) > 0)
				max = i;
		}

	}

	public void testMaximum() {
		findMax(ar1);
		findMax(ar2);
		findMax(ar3);
	}
}