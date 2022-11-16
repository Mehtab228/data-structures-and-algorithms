package datastructures.trees;

import java.util.ArrayList;

public class KaryNode<T> {
  public T value;
  public ArrayList<KaryNode<T>> childList;

  public KaryNode() {
    childList = new ArrayList<>();
    //empty
  }

  public KaryNode(T value) {
    childList = new ArrayList<>();
    this.value = value;
  }

  public void addChild(KaryNode<T> child) {
    childList.add(child);
  }
}
