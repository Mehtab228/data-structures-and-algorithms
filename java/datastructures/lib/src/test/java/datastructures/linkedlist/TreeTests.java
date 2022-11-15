package datastructures.linkedlist;

import datastructures.trees.BinarySearchTree;
import datastructures.trees.BinaryTree;
import datastructures.trees.Node;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class TreeTests {

  @Test
  void test_constructor_empty_tree() {
    BinaryTree<Integer> sut = new BinaryTree<>();
    assertNotNull(sut);
  }

  @Test
  void test_constructor_single_node() {
    Node<Double> pi = new Node<>(3.14159);
    BinaryTree<Double> sut = new BinaryTree<Double>(pi);
    assertNotNull(sut);
    assertEquals(sut.root.value, 3.14159);
  }

  @Test
  void test_add_one() {
    BinarySearchTree<Integer> sut = new BinarySearchTree<>();
    sut.add(5);
    assertEquals(sut.root.value, 5);
  }

  @Test
  void test_add_multiple() {
    BinarySearchTree<Integer> sut = new BinarySearchTree<>();
    sut.add(5);
    sut.add(3);
    sut.add(6);
    assertEquals(sut.root.value, 5);
    assertEquals(sut.root.left.value, 3);
    assertEquals(sut.root.right.value, 6);
  }

  @Test
  void test_add_multiple_all_less() {
    BinarySearchTree<Integer> sut = new BinarySearchTree<>();
    sut.add(5);
    sut.add(4);
    sut.add(3);
    sut.add(2);
    sut.add(1);
    assertEquals(sut.root.value, 5);
    assertEquals(sut.root.left.value, 4);
    assertEquals(sut.root.left.left.value, 3);
    assertEquals(sut.root.left.left.left.value, 2);
    assertEquals(sut.root.left.left.left.left.value, 1);
  }

  @Test
  void test_add_multiple_all_more() {
    BinarySearchTree<Integer> sut = new BinarySearchTree<>();
    sut.add(5);
    sut.add(6);
    sut.add(7);
    sut.add(8);
    sut.add(9);
    assertEquals(sut.root.value, 5);
    assertEquals(sut.root.right.value, 6);
    assertEquals(sut.root.right.right.value, 7);
    assertEquals(sut.root.right.right.right.value, 8);
    assertEquals(sut.root.right.right.right.right.value, 9);
  }

  @Test
  void test_contains_one() {
    BinarySearchTree<String> sut = new BinarySearchTree<>();
    sut.add("Hello");
    assertTrue(sut.contains("Hello"));
  }

  @Test
  void test_contains_many() {
    BinarySearchTree<Integer> sut = new BinarySearchTree<>();
    sut.add(5);
    sut.add(3);
    sut.add(2);
    //              (5)
    //             /   \
    //          (3)     (8)
    //         /   \   /   \
    //       (2)  (4) (7)  (9)
    assertTrue(sut.contains(5));
    assertTrue(sut.contains(3));
    assertTrue(sut.contains(2));
    assertFalse(sut.contains(-1));
    assertFalse(sut.contains(-100));
    assertFalse(sut.contains(30));
  }

  @Test
  void test_setting_single_left_right() {
    Node<String> a = new Node<>("A");
    Node<String> b = new Node<>("B");
    Node<String> c = new Node<>("C");
    BinaryTree<String> sut = new BinaryTree<>(a);
    a.left = b;
    a.right = c;
    //              (A)
    //             /   \
    //          (B)     (C)
    assertEquals(sut.root.value, "A");
    assertEquals(sut.root.left.value, "B");
    assertEquals(sut.root.right.value, "C");
  }

  @Test
  void test_preordertraversal() {
    BinaryTree<String> sut = new BinaryTree<>();
    Node<String> a = new Node<>("A");
    Node<String> b = new Node<>("B");
    Node<String> c = new Node<>("C");
    Node<String> d = new Node<>("D");
    Node<String> e = new Node<>("E");
    Node<String> f = new Node<>("F");
    Node<String> g = new Node<>("G");
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;
    sut.root = a;
    //              (A)
    //             /   \
    //          (B)     (E)
    //         /   \   /   \
    //       (C)  (D) (F)  (G)
    String[] test = {"A", "B", "D", "E", "C", "F", "G"};
    assert (Arrays.equals(sut.preOrderTraversal(), test));
  }

  @Test
  void test_inordertraversal() {
    BinaryTree<String> sut = new BinaryTree<>();
    Node<String> a = new Node<>("A");
    Node<String> b = new Node<>("B");
    Node<String> c = new Node<>("C");
    Node<String> d = new Node<>("D");
    Node<String> e = new Node<>("E");
    Node<String> f = new Node<>("F");
    Node<String> g = new Node<>("G");
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;
    sut.root = a;
    //              (A)
    //             /   \
    //          (B)     (E)
    //         /   \   /   \
    //       (C)  (D) (F)  (G)
    String[] test = {"D", "B", "E", "A", "F", "C", "G"};
    assert (Arrays.equals(sut.inOrderTraversal(), test));
  }

  @Test
  void test_max() {
    BinaryTree<Integer> sut = new BinaryTree<>();
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(7);
    Node<Integer> c = new Node<>(5);
    Node<Integer> d = new Node<>(2);
    Node<Integer> e = new Node<>(6);
    Node<Integer> g = new Node<>(5);
    Node<Integer> i = new Node<>(4);
    //              (2)
    //             /   \
    //          (7)     (5)
    //         /   \       \
    //       (2)  (6)      (9)
    //           /   \     /
    //          (5) (11) (4)
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    e.left = g;
    sut.root = a;
    assertEquals(sut.max(), 7);
  }

  @Test
  void test_breadthfirsttraversal() {
    BinaryTree<String> sut = new BinaryTree<>();
    Node<String> a = new Node<>("A");
    Node<String> b = new Node<>("B");
    Node<String> c = new Node<>("C");
    Node<String> d = new Node<>("D");
    Node<String> e = new Node<>("E");
    Node<String> f = new Node<>("F");
    Node<String> g = new Node<>("G");
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;
    sut.root = a;
    //              (A)
    //             /   \
    //          (B)     (E)
    //         /   \   /   \
    //       (C)  (D) (F)  (G)
    String [] test = {"A", "B"};
    assertArrayEquals(test, sut.breadthFirstTraversal());
  }
}
