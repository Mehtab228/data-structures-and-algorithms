package datastructures.StackandQueue;

public class Stack<T> {
  private Node<T> top = null;
  private int size = 0;

  public int size() {
    return size;
  }

  public void push(T value) {
    Node<T> newTop = new Node<>();
    newTop.next = top;
    top = newTop;
    size++;
  }

  public T pop() throws NullPointerException{
    if(top != null){
      Node<T> exitingNode = top;
      top = top.next;
      size--;
      return exitingNode.value;
    } else {
      throw new  NullPointerException("Stack is empty");
    }
  }

  public T peek() throws NullPointerException{
    if(top != null){
      return top.value;
    } else {
      throw new NullPointerException("Stack is empty");
    }
  }

  public boolean isEmpty() {
    return top == null;
  }

}
