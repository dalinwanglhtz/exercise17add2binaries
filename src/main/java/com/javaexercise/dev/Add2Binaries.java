package com.javaexercise.dev;

public class Add2Binaries {

	public static long add(long binary1, long binary2) {
		
		int i = 0, remainder = 0;
		int[] sum = new int[20];
		
		while(binary1 != 0 || binary2 != 0) {
			sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
			remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
			binary1 /= 10;
			binary2 /= 10;
		}
		
		if(remainder != 0) {
			sum[i++] = remainder;
		}
		i--;
		String result = "";
		while(i>=0) {
			result += sum[i];
		}
		
		return Long.valueOf(result);
	}

}
