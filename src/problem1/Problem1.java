package problem1;

import java.util.HashSet;
import java.util.Set;

/**
 * ProjectEuler.net - Problem 1 Solution
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author elainetai
 * 
 */
public class Problem1 {

	public static int calculateSumsBelow(int max) {
		HashSet<Integer> multiplesOfThreeAndFive = new HashSet<Integer>();

		multiplesOfThreeAndFive.addAll(addMultiplesOfThreeBelowMax(max));
		multiplesOfThreeAndFive.addAll(addMultiplesOfFiveBelowMax(max));

		return sumMultiples(multiplesOfThreeAndFive);
	}

	public static int sumMultiples(Set<Integer> multiples) {
		int sum = 0;
		for (int i : multiples) {
			sum += i;
		}

		return sum;
	}

	public static Set<Integer> addMultiplesOfThreeBelowMax(int max) {
		return getMultiplesOfNumBelowMax(3, max);
	}

	public static Set<Integer> addMultiplesOfFiveBelowMax(int max) {
		return getMultiplesOfNumBelowMax(5, max);
	}

	public static Set<Integer> getMultiplesOfNumBelowMax(int num, int max) {
		int numMultiples = getMultiplesCount(num, max);
		HashSet<Integer> multiples = new HashSet<Integer>();

		for (int i = 1; i <= numMultiples; i++) {
			multiples.add(num * i);
		}

		return multiples;
	}

	public static int getMultiplesCount(int num, int max) {

		int numMultiples = max / num;

		if (max % num == 0 && max != 0) {
			numMultiples--;
		}

		return numMultiples;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(calculateSumsBelow(1000));
		

	}

}
