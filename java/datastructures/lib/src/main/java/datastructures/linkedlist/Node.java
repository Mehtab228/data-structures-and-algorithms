package datastructures.linkedlist;

public class Node<Z> {

  public Z currentNodeValue;
  public Node<Z> next = null;

  public Node(Z currentNodeValue) {
    this.currentNodeValue = currentNodeValue;
  }

  //Empty linked list
  public Node(){

  }

}
