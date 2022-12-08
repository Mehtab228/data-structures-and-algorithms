package datastructures.hashmap;

import java.util.ArrayList;

public class LeftJoin {

  public ArrayList<ArrayList<String>> joinHashMapPair(HashMap<String, String> hashMapLeft, HashMap<String, String> hashMapRight) {
    ArrayList<ArrayList<String>> output = new ArrayList<>();
    for (String key : hashMapLeft.keys()) {
      ArrayList<String> row = new ArrayList<>();
      row.add(key);
      row.add(hashMapLeft.get(key));
      output.add(row);
    }
    for (ArrayList<String> row : output) {
      String key = row.get(0);
      if (hashMapRight.contains(key))
        row.add(hashMapRight.get(key));
      else
        row.add(null);
    }
    return output;
  }
}
