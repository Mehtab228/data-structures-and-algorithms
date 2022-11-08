package datastructures.linkedlist.StacksandQueues;
import datastructures.StackandQueue.Queue;
import datastructures.StackandQueue.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StackandQueueTest {

  @Test
  void pushOntoStack(){
    Stack<String> sut = new Stack<>();
    sut.push("potato");
    assertTrue(sut.peek() == ("potato"));
  }

  @Test
  void pushMultipleStack(){
    Stack<String> sut = new Stack<>();
    sut.push("potato");
    sut.push("tomato");
    assertTrue(sut.size() == 2);
    assertTrue(sut.peek() == "tomato");
  }

  @Test void removeFromStack(){
    Stack<String> sut = new Stack<>();
    sut.push("I");
    sut.push("work");
    sut.pop();
    assertTrue(sut.peek() == "I");
    assertTrue(sut.size() == 1);
  }

  @Test void emptyStack(){
    Stack<String> sut = new Stack<>();
    sut.push("I");
    sut.push("work");
    sut.pop();
    sut.pop();
    assertTrue(sut.isEmpty());
  }

  @Test void peekStack(){
    Stack<String> sut = new Stack<>();
    sut.push("I");
    sut.push("work");
    assertTrue(sut.peek() == "work");
  }

  @Test void PeekEmptyStack(){
    Stack<String> sut = new Stack<>();
    assertThrows(NullPointerException.class, () -> sut.peek());
  }

  @Test void newStack(){
    Stack<String> sut = new Stack<>();
    assertTrue(sut.isEmpty() == true);
  }

  @Test void enqueueString(){
    Queue<String> sut = new Queue<>();
    sut.enqueue("work");
    assertTrue(sut.peek() == "work");
  }

  @Test void enqueueMultiple(){
    Queue<String> sut = new Queue<>();
    sut.enqueue("work");
    sut.enqueue("less");
    assertEquals(2, sut.size());
    assertSame("work", sut.peek());
  }

  @Test void dequeueValue(){
    Queue<String> sut = new Queue<>();
    sut.enqueue("work");
    sut.enqueue("less");
    assertSame("work", sut.dequeue());
  }

  @Test void emptyQueue(){
    Queue<String> sut = new Queue<>();
    sut.enqueue("work");
    sut.enqueue("less");
    sut.dequeue();
    assertThrows(NullPointerException.class, () -> sut.dequeue());
  }

}
