package datastructures.linkedlist;

public class LinkedList<I extends Number> {
  public Node head = null;
  private int sizeOfList = 0;
  public LinkedList(){}

public void insert(String value) {
  // 3 steps, 1. Create new node with the value, set the previous head to be next, set the head to be the value passed in (newHead)
  Node newHead = new Node(value);
  newHead.next = head;
  head = newHead;
  sizeOfList++;
}

public boolean includes(String value) {
  Node current = head;
  while (current.next != null) {
    if (current.next.equals(value))
      return true;
      current = current.next;
  }
  return false;
}

  @Override
  public String toString()
    {
      StringBuilder newStr = new StringBuilder();
      Node current = head;
      while(current != null) {
        newStr.append("{" + " " + current.value+ " " + "} ->");
        current = current.next;
      }
        newStr.append("NULL");
      return  newStr.toString();
    }

    public void append(String value) {
      Node current = head;
      while(current.next != null) {
        current = current.next;
      }
      Node newNode = new Node(value);
      current.next = newNode;
    }

    public void insertBefore(String searchValue, String addValue) {
      Node current = head;
      while(current != null) {
        if (current.next.value == searchValue) {
          Node newNode = new Node(addValue);
          newNode.next = current.next;
          current.next = newNode;
          return;
        }
        current = current.next;
      }
      System.out.println("Search Value not found");
    }

  public void insertAfter(String searchValue, String addValue){
    Node current = head;
    while(current != null){
      if (current.value == searchValue){
        Node newNode = new Node(addValue);
        newNode.next = current.next;
        current.next = newNode;
        return;
      }
      current = current.next;
    }
    System.out.println("Search value not found");
  }

  public String kthFromEnd(int k){
    if(k < 0) throw new IllegalArgumentException("Input can not be negative.");
    int i = 0;
    Node front = head;
    Node rear = null;
    while (front != null){
      if(i-k > 0){
        rear = rear.next;
      } else if (i-k == 0) {
        rear = head;
      }
      front = front.next;
      i++;
    }
    if(i-k < 0) throw new IllegalArgumentException("Input exceeds linked list length.");
    return rear.value;
  }

  public LinkedList<Integer> zipLists(LinkedList<Number> list1, LinkedList<Integer> list2) {
    if(list1.sizeOfList < 1)
      return list2;
    if(list2.sizeOfList < 1)
      return list2;
    LinkedList<Integer> output = new LinkedList<>();
    int position = 0;
    while(position < list1.sizeOfList || position < list2.sizeOfList) {
      if(position < list1.sizeOfList)
        output.append(list1.kthFromEnd(list1.sizeOfList - position - 1));
      if(position < list2.sizeOfList)
        output.append(list2.kthFromEnd(list2.sizeOfList - position - 1));
      position++;
    }
    return output;
  }


}
