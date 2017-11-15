import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTester {

	@Test
	public void testPartition() {
		int[] pre = {5};
		System.out.println("------------------------");
		System.out.println("Running Partition Test 1");
		System.out.println("------------------------");
		int return1 = QuickSort.partition(pre, 0, 0);
		System.out.println("Partition Test 1 Data");
		for(int i = 0; i < pre.length; i++) {
			System.out.println(return1);
		}
		System.out.println("------------------------");
		assertTrue(return1 == 0);
	}
	
	@Test
	public void testPartition2() {
		int[] pre = {5, -3, 7, -4, 10, 9, 3, 7};
		System.out.println("Running Partition Test 2");
		System.out.println("------------------------");
		int return2 = QuickSort.partition(pre, 0, 7);
		System.out.println("Partition Test 2 Data");
		for(int i = 0; i < pre.length; i++) {
			System.out.println(pre[i]);
		}
		System.out.println("-------------------------");
		assertTrue(return2 == 3);
	}

	@Test
	public void testQuickSort() {
		int[] pre = {5, -3, 7, -4, 10, 9, 3, 7};
		int[] sorted = {-4, -3, 3, 5, 7, 7, 9, 10};
		System.out.println("Running Quick Sort Test 1");
		System.out.println("-------------------------");
		QuickSort.quickSort(pre, 0, 7);
		System.out.println("QuickSort Test 1 Data");
		for(int i = 0; i < sorted.length; i++) {
			System.out.println(pre[i]);
		}
		assertTrue(Arrays.equals(pre, sorted));
	}
}
