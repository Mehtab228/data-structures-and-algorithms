package datastructures.hashmap;

public class HashMapReturnFirstRepeated {

  public String getFirstRepeatedWord(String str) {
    HashMap<String, Boolean> hashmap = new HashMap<>(size);
    String current = "";
    for (int i = 0; i < str.length(); i++) {
      char c = Character.toLowerCase(str.charAt(i));
      if ((c >= 'a' && c <= 'z') || c == '\'')
        current = current + c;
      else if (c == ' ' || i == str.length() - 1) {
        if (hashmap.contains(current))
          return current;
        hashmap.set(current, true);
        current = "";
      }
    }
    return "";
  }
}
