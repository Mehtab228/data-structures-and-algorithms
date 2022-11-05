package datastructures.linkedlist;

import datastructures.StackandQueue.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void createEmptyLinkedList()
  {
    LinkedList<Number> emptyLL = new LinkedList<Number>();
    assertTrue(emptyLL.head == null);
  }

  @Test void insertIntoLinkedList()
  {
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("I am Here");
    assertTrue(linked.head.value == "I am Here");
  }

  @Test void headPointsToNext()
  {
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("I am Here");
    assertTrue(linked.head.next == null);
  }
  @Test void insertMultipleNodes(){
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("I am Here");
    linked.insert("Wow!");
    assertTrue(linked.head.next.value == "I am Here");
  }


  @Test void didNotToFindValue(){
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("I am here");
    linked.insert("Wow");
    assertFalse(linked.includes("not here"));
  }

  @Test void insertAtEnd(){
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("I");
    linked.insert("did");
    linked.append("add");
    String expected = "{ did } ->{ I } ->{ add } ->NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test void insertMultipleAtEnd(){
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("Hey");
    linked.insert("I!");
    linked.append("added");
    linked.append("at");
    linked.append("end");
    linked.append("it worked!");
    String expected = "{ I! } ->{ Hey } ->{ added } ->{ at } ->{ end } ->{ it worked! } ->NULL";
    assertEquals(linked.toString(), expected);
  }
  @Test void insertBeforeMiddle(){
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("I");
    linked.append("added");
    linked.append("in");
    linked.insertBefore("added", "more");
    String expected = "{ I } ->{ more } ->{ added } ->{ in } ->NULL";
    assertEquals(linked.toString(), expected);
  }
  @Test void insertAfterTheMiddle(){
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("I");
    linked.append("added");
    linked.append("in");
    linked.insertAfter("added", "middle");
    String expected = "{ I } ->{ added } ->{ middle } ->{ in } ->NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test void insertAfterTheEnd(){
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("I");
    linked.append("added");
    linked.append("in");
    linked.insertAfter("dit dah", "the");
    String expected = "{ I } ->{ added } ->{ in } ->NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test
  void kthEqualToLLLength() {
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("potato");
    linked.insert("tomato");
    linked.insert("cucumber");
    linked.insert("batman");
    assertEquals("batman", linked.kthFromEnd(3));
  }

  @Test
  void kthFromEndNegative() {
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("potato");
    linked.insert("tomato");
    assertThrows(IllegalArgumentException.class, () -> linked.kthFromEnd(-3));
  }

  @Test
  void kthLargerThanLLLength() {
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("batman");
    linked.insert("superman");
    assertThrows(NullPointerException.class, () -> linked.kthFromEnd(2));
  }

  @Test
  void kthFromEndTinyLL() {
    LinkedList<Number> linked = new LinkedList<Number>();
    linked.insert("batman");
    assertEquals("batman", linked.kthFromEnd(0));
    assertThrows(NullPointerException.class, () -> linked.kthFromEnd(1));
  }

}
