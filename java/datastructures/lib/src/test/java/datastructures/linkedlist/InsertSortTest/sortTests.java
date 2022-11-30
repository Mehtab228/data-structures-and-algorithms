package datastructures.linkedlist.InsertSortTest;

import datastructures.StackandQueue.Stack;
import org.junit.jupiter.api.Test;
import datastructures.Sorting.InsertionSort;
import datastructures.Sorting.mergeSort;

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

  @Test
  void test2() {
    mergeSort sut = new mergeSort();
    int[] arr = {8, 4, 23, 42, 16, 15};
    int[] target = {4, 8, 15, 16, 23, 42};
    sut.mergeSort(arr);
    assertArrayEquals(arr, target);
  }

  @Test
  void test3() {
    mergeSort sut = new mergeSort();
    int[] arr = {20, 18, 12, 8, 5, -2};
    int[] target = {-2, 5, 8, 12, 18, 20};
    sut.mergeSort(arr);
    assertArrayEquals(arr, target);
  }

}
