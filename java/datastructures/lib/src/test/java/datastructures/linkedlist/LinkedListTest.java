package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void createEmptyLinkedList()
  {
    LinkedList emptyLL = new LinkedList();
    assertTrue(emptyLL.head == null);
  }

  @Test void insertIntoLinkedList()
  {
    LinkedList linked = new LinkedList();
    linked.insert("I am Here");
    assertTrue(linked.head.value == "I am Here");
  }

  @Test void headPointsToNext()
  {
    LinkedList linked = new LinkedList();
    linked.insert("I am Here");
    assertTrue(linked.head.next == null);
  }
  @Test void insertMultipleNodes(){
    LinkedList linked = new LinkedList();
    linked.insert("I am Here");
    linked.insert("Wow!");
    assertTrue(linked.head.next.value == "I am Here");
  }


  @Test void didNotToFindValue(){
    LinkedList linked = new LinkedList();
    linked.insert("I am here");
    linked.insert("Wow");
    assertFalse(linked.includes("not here"));
  }

}
