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

  @Test void insertAtEnd(){
    LinkedList linked = new LinkedList();
    linked.insert("I");
    linked.insert("did");
    linked.append("add");
    String expected = "{ did } ->{ I } ->{ add } ->NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test void insertMultipleAtEnd(){
    LinkedList linked = new LinkedList();
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
    LinkedList linked = new LinkedList();
    linked.insert("I");
    linked.append("added");
    linked.append("in");
    linked.insertBefore("added", "more");
    String expected = "{ I } ->{ more } ->{ added } ->{ in } ->NULL";
    assertEquals(linked.toString(), expected);
  }
  @Test void insertAfterTheMiddle(){
    LinkedList linked = new LinkedList();
    linked.insert("I");
    linked.append("added");
    linked.append("in");
    linked.insertAfter("added", "middle");
    String expected = "{ I } ->{ added } ->{ middle } ->{ in } ->NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test void insertAfterTheEnd(){
    LinkedList linked = new LinkedList();
    linked.insert("I");
    linked.append("added");
    linked.append("in");
    linked.insertAfter("dit dah", "the");
    String expected = "{ I } ->{ added } ->{ in } ->NULL";
    assertEquals(linked.toString(), expected);
  }
}
