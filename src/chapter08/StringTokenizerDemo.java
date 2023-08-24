package chapter08;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main(String[] args) {
    String s = "of the people, by the people, for the people";
    StringTokenizer st = new StringTokenizer(s);
    System.out.println(st.countTokens());

    StringTokenizer st1 = new StringTokenizer(s, ",");
    System.out.println(st1.countTokens());

//    while(st.hasMoreTokens()){
//      System.out.println(st.nextToken());
//    }

    while(st1.hasMoreTokens()){
      System.out.println(st1.nextToken());
    }

    st1 = new StringTokenizer(s,","); //StringTokenizer을 사용한 st1 객체는 일회성임!
    while(st1.hasMoreTokens()){
      System.out.println(st1.nextToken());
    }
  }
}