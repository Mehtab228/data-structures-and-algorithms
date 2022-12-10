package datastructures.linkedlist;
import datastructures.hashmap.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTests {
  @Test void addPairToHashMap(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong","yeehaw");
  }
  @Test void addDupeKeyToHashMapCheckValue(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong","yeehaw");
    sut.set("bingbong","ditdah");
    assertEquals("ditdah", sut.get("bingbong"));
  }
  @Test void addDupeKeyToHashMapCheckKeys(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong","yeehaw");
    sut.set("bingbong","ditdah");
    assertEquals(1, sut.keys().size());
  }
  @Test void collisionHandlingCheckKeys(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong","yeehaw");
    sut.set("potato","ditdah");
    assertEquals(2, sut.keys().size());
  }
  @Test void hasIsTrue(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong","yeehaw");
    assertTrue(sut.has("bingbong"));
  }
  @Test void hasIsTrueWithCollision(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong","yeehaw");
    sut.set("potato", "potahtoe");
    assertTrue(sut.has("potato"));
  }
  @Test void hasIsFalse(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong","yeehaw");
    assertFalse(sut.has("diggity"));
  }
  @Test void getSuccess(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong","yeehaw");
    assertEquals("yeehaw", sut.get("bingbong"));
  }
  @Test void getReturnsNull(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong","yeehaw");
    assertEquals("yeehaw", sut.get("bingbong"));
  }
  @Test void returnAllKeys(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong", "yeehaw");
    sut.set("potato", "potahtoe");
    sut.set("tomato", "tomahtoe");
    assertEquals(3, sut.keys().size());
  }
  @Test void returnValueFromCollision(){
    HashMap sut = new HashMap<>(size);
    sut.set("bingbong", "yeehaw");
    sut.set("potato", "potahtoe");
    sut.set("tomato", "tomahtoe");
    assertEquals("potahtoe", sut.get("potato"));
  }
}
