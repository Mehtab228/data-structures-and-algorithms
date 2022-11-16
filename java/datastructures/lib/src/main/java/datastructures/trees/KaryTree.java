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
}
