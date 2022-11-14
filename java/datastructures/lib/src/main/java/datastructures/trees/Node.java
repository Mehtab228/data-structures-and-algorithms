package datastructures.trees;

public class Node<T> {
  public T value;
  public Node left = null;
  public Node<T> right = null;

  public Node() {}

  public Node(T value) {
    this.value = value;
  }

}
