package datastructures.StackandQueue;

public class PseudoQueue<T> {
  public Stack<T> front;
  public Stack<T> back;
  public PseudoQueue() {
    this.front = new Stack<>();
    this.back = new Stack<>();
  }

  public void enqueue(T value) {
    back.push(value);
  }

  public T dequeue() {
    if(front.isEmpty()){
      while(!back.isEmpty()){
        front.push(back.pop());
      }
    }
    return front.pop();
  }

  }

