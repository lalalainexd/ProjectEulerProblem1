package problem1;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;

public class NaturalNumberSumTest {

	@Test
	public void testGetMultiplesCount() {
		int count = Problem1.getMultiplesCount(1, 0);
		assertEquals(0, count);

		count = Problem1.getMultiplesCount(1, 1);
		assertEquals(0, count);

		count = Problem1.getMultiplesCount(1, 2);
		assertEquals(1, count);

		count = Problem1.getMultiplesCount(1, 3);
		assertEquals(2, count);
		
		count = Problem1.getMultiplesCount(3, 3);
		assertEquals(0, count);
		
		count = Problem1.getMultiplesCount(3, 6);
		assertEquals(1, count);
		
	}

	@Test
	public void testAddMultiplesOfNumBelowMax() {
		Set<Integer> nums;

		nums = Problem1.getMultiplesOfNumBelowMax(1, 0);
		assertEquals(0, nums.size());

		nums = Problem1.getMultiplesOfNumBelowMax(1, 1);
		assertEquals(0, nums.size());

		nums = Problem1.getMultiplesOfNumBelowMax(1, 2);
		assertEquals(1, nums.size());

		nums = Problem1.getMultiplesOfNumBelowMax(1, 5);
		assertEquals(4, nums.size());

		nums = Problem1.getMultiplesOfNumBelowMax(3, 3);
		assertEquals(0, nums.size());
		
		nums = Problem1.getMultiplesOfNumBelowMax(3, 20);
		printSet(nums);
		assertEquals(6, nums.size());
		
		nums = Problem1.getMultiplesOfNumBelowMax(5, 20);
		printSet(nums);
		assertEquals(3, nums.size());
		
		nums = Problem1.getMultiplesOfNumBelowMax(3, 21);
		printSet(nums);
		assertEquals(6, nums.size());
		
		nums = Problem1.getMultiplesOfNumBelowMax(5, 21);
		printSet(nums);
		assertEquals(4, nums.size());

	}

	private void printSet(Set<Integer> set) {
		for (int num : set) {
			System.out.print(num + ", ");
		}
		System.out.println("");
	}
}
