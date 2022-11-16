package datastructures.trees;
import java.util.ArrayList;

public class KaryTree<T extends Comparable<T>> {

  public KaryNode<T> root;

  public KaryTree() {

  }

  public KaryTree(KaryNode<T> root) {
    this.root = root;
  }

  @Override
  public String toString() {
    ArrayList<String> list = new ArrayList<>();
    if (!root.childList.isEmpty())
      list.add(root.value.toString());
    buildPreOrderList(list, root);
    return list.toString();
  }

  public void buildPreOrderList(ArrayList<String> list, KaryNode<T> inputNode) {
    if (!inputNode.childList.isEmpty()) {
      for (KaryNode<T> node : inputNode.childList) {
        list.add(node.value.toString());
        buildPreOrderList(list, node);
      }
    }
  }

  public KaryTree<String> fizzBuzz(KaryTree<Integer> tree) {
    if (tree.root == null)
      throw new IllegalArgumentException();
    KaryNode<String> outputRoot = new KaryNode<>();
    outputRoot.value = getFizzBuzzValue(tree.root.value);
    buildStringTree(outputRoot, tree.root);
    return new KaryTree<String>(outputRoot);
  }


  private void buildStringTree(KaryNode<String> outNode, KaryNode<Integer> inNode) {
    if (!inNode.childList.isEmpty()) {
      for (KaryNode<Integer> node : inNode.childList) {
        KaryNode<String> temp = new KaryNode<>();
        temp.value = getFizzBuzzValue(node.value);
        outNode.childList.add(temp);
        buildStringTree(temp, node);
      }
    }
  }

  private String getFizzBuzzValue(Integer inputValue) {
    if (inputValue < 3)
      return inputValue.toString();
    else if (inputValue % 3 == 0 && inputValue % 5 == 0)
      return "FizzBuzz";
    else if (inputValue % 3 == 0)
      return "Fizz";
    else if (inputValue % 5 == 0)
      return "Buzz";
    else
      return inputValue.toString();
  }
}
