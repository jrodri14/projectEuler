/**
 * 
 */
package com.project.euler.problems;

/**
 * @author Jesus Rodriguez
 *
 */
public class Problem1 {

	/*
	 * If we list all the natural numbers below 10 taht are multiples of 3 or 5,
	 * we get 3,5,6,9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	private static int three = 3;
	private static int five = 5;

	public static int getSum(int input) {

		int largest3 = getLargest(input, three);
		int largest5 = getLargest(input, five);
		int largest15 = getLargest(input, three*five);
		int sumOf3 = getSumOfEach(largest3, three);
		int sumOf5 = getSumOfEach(largest5, five);
		int sumOf15 = getSumOfEach(largest15, three*five);
		// We subtract duplicates. which will be 3*5 = 15.
		// 15,30,45 and so on..
		int sum = sumOf3 + sumOf5 - sumOf15;
		return sum;

	}

	private static int getLargest(int input, int num) {
		double highest = 0;
		for (int i = 1; i <= num; i++) {
			if ((input - i) % num == 0) {
				int tmp = input-i;
				highest = ( (double)tmp / (double)num );
				System.out.println(highest + " " +  ( input-i) / 5 + " " + num + " " + tmp);
				break;
			}
		}
		
		
		return (int)highest;
	}

	private static int getSumOfEach(int largest, int multiOf) {

		int sum = multiOf * ((largest * (largest + 1)) / 2);
		 System.out.println(sum);
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sum of 3 or 5 below 1000 is:" + getSum(1000));

	}

}
