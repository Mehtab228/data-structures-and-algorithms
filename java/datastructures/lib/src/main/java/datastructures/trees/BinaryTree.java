package datastructures.trees;
import datastructures.StackandQueue.Queue;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<? super T>> {

  public Node<T> root;

  public BinaryTree() {
    //empty;
  }

  public BinaryTree(Node<T> root) {
    this.root = root;
  }

  public Object[] preOrderTraversal() {
    ArrayList<T> outputList = new ArrayList<>();
    preOrder(outputList, root);
    return outputList.toArray();
  }

  private void preOrder(ArrayList<T> list, Node<T> localRoot) {
    list.add(localRoot.value);
    if (localRoot.left != null)
      preOrder(list, localRoot.left);
    if (localRoot.right != null)
      preOrder(list, localRoot.right);
  }

  public Object[] inOrderTraversal() {
    ArrayList<T> outputList = new ArrayList<>();
    inOrder(outputList, root);
    return outputList.toArray();
  }

  private void inOrder(ArrayList<T> list, Node<T> localRoot) {
    if (localRoot.left != null)
      inOrder(list, localRoot.left);
    list.add(localRoot.value);
    if (localRoot.right != null)
      inOrder(list, localRoot.right);
  }

  public Object[] postOrderTraversal() {
    ArrayList<T> outputList = new ArrayList<>();
    postOrder(outputList, root);
    return  outputList.toArray();
  }

  private void postOrder(ArrayList<T> list, Node<T> root) {
    if (root.left != null)
      postOrder(list, root.left);
    if (root.right != null)
      postOrder(list, root.right);
    list.add(root.value);
  }

  public T max() {
    if (root == null)
      throw new IllegalArgumentException();
    Queue<Node<T>> queue = new Queue<>();
    queue.enqueue((Node<T>) root);
    T max = (T) root.value;
    while(!queue.isEmpty()) {
      Node<T> temp = queue.dequeue();
      if (temp.value.compareTo(max) > 0)
        max = temp.value;
      if ( temp.left != null)
        queue.enqueue(temp.left);
      if (temp.right != null)
        queue.enqueue(temp.right);
    }
    return max;
  }


}
