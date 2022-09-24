package com.te.programs;

public class FrequencyOfProg {
	static int temp;
	static int a;

	public static void main(String[] args) {

		int d[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 4, 3, 5, 2, 1, 1 };
		int sd[];
		for (int i = 0; i < d.length; i++) {
			for (int j =0; j<i; j++) {
				if (d[i] == d[j]) {
					temp = temp + 1;
				}
			
			System.out.println(d[i] + "ocuured in" + temp + "time");
			temp=0;
		}
			}
	}
}
