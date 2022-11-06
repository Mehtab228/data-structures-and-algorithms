package datastructures.StackandQueue;

public class Queue<T> {
    private Node<T> front = null;
    private Node<T> back = null;
    private int size = 0;

    public Queue(){
      // empty queue
    }

  public int size() {
    return size;
  }

    public void enqueue(T value){
      Node<T> newNode= new Node<>(value);
      if(size == 0){
        this.front = newNode;
      } else {
      this.back = newNode;
      }
      size++;
    }

    public T dequeue() throws NullPointerException{
      if(front == null){
        throw new NullPointerException("Queue is empty");
      } else {
      T output = front.value;
      front = front.next;
      size--;
      return output;
      }
    }

  public T peek() throws NullPointerException{
      if(front == null){
        throw new NullPointerException("Queue is empty");
      } else {
        return front.value;
      }
  }

  public boolean isEmpty() {
    return front == null;
  }

}
