package com.checkoutProcess;


public class Validator {
	
	public int calculatePromotionValue(int a, int b, int c, int d) {
		
		return (calculateAsValue(a)+calculateBsValue(b)+calculateCandDsValue(c,d));
		
	}

	public int calculateAsValue(int a) {
		return calculateValueAsPerSKU(a, Constants.three, Constants.threeTimesA,Constants.A);

	}

	public int calculateBsValue(int b) {
		return calculateValueAsPerSKU(b, Constants.two, Constants.twoTimesB, Constants.B);
	}

	public int calculateCandDsValue(int c, int d) {
		int max = (c > d) ? (((c - d) * Constants.C) + d * Constants.combinationOfCandD)
				: (((d - c) * Constants.D) + c * Constants.combinationOfCandD);
		System.out.println("max"+max);
		return max;

	}

	private int calculateValueAsPerSKU(int b, int count, int promotionsValue, int singleValue) {
		if (b > 2) {
			System.out.println("valueAfterCalculation");
			int singleUnit = b - ((b / count) * count);
			int coupleUnit = b / count;
			int valueAfterCalculation = ((singleUnit * singleValue) + (coupleUnit * promotionsValue));
			System.out.println("valueAfterCalculation"+valueAfterCalculation);
			return valueAfterCalculation;
		} else {
			System.out.println("valueAfterCalculation"+ singleValue * b);
			return singleValue * b;
		}
	}

}
