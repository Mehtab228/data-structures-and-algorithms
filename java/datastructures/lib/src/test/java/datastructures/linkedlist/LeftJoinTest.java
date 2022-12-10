package datastructures.linkedlist;

import datastructures.hashmap.HashMap;
import datastructures.hashmap.LeftJoin;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeftJoinTest {

    @Test
    void example() {
      LeftJoin sut = new LeftJoin();
      HashMap<String, String> left = new HashMap<>(size);
      HashMap<String, String> right = new HashMap<>(size);
      left.set("apple", "A");
      right.set("apple", "i");
      assertEquals(sut.joinHashMapPair(left, right).toString(), "[[apple, A, a], [elephant, E, e], [cat, C, null], [fox, F, f], [ice, I, i], [banana, B, b], [house, H, null]]");
    }
}
