package chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + "-");
    }
    System.out.println();

    iterator = list.iterator(); //iterator는 1회성으로 중복해서 쓰고 싶다면 한번더 불러와야 한다.
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + "-");
    }
    System.out.println();
  }
}
