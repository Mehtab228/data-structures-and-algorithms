package StacksandQueues;
import datastructures.StackandQueue.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class StackandQueueTest {

  @Test
  void pushOntoStack(){
    Stack<String> sut = new Stack<>();
    sut.push("potato");
    assertTrue (sut.size() == 1);
  }
}
