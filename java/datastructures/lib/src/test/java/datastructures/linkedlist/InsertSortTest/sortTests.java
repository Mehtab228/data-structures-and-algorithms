package datastructures.linkedlist.InsertSortTest;

import datastructures.StackandQueue.Stack;
import org.junit.jupiter.api.Test;
import datastructures.Sorting.InsertionSort;

import static org.junit.jupiter.api.Assertions.*;

public class sortTests {

  @Test
  void test_example_one() {
    InsertionSort sut = new InsertionSort();
    int[] arr = {8, 4, 23, 42, 16, 15};
    int[] target = {4, 8, 15, 16, 23, 42};
    sut.insertSort(arr);
    assertArrayEquals(arr, target);
  }

}
