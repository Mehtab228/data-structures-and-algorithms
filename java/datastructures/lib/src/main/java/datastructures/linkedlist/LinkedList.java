package datastructures.linkedlist;

public class LinkedList<Z>
{
  public Node<Z> head = null;
  private int sizeOfList = 0;

public void insert(Z value) {
  // 3 steps, 1. Create new node with the value, set the previous head to be next, set the head to be the value passed in (newHead)
  Node<Z> newHead = new Node<>(value);
  newHead.next = head;
  head = newHead;
  sizeOfList++;
}

public boolean includes(Z value) {
  Node<Z> currentHead = head;
  while (currentHead != null) {
    if (currentHead.equals(value))
      return true;
      currentHead = currentHead.next;
  }
  return false;
}

  @Override
  public String toString()
    {
      String output = "";
      Node<Z> current = head;
      while(current != null) {
        output += "{" + " " + current.currentNodeValue + " " + "} ->";
        current = current.next;
      }
        return output + "null";
    }
}
