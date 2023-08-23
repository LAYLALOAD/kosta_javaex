package chapter09;

public class CheckedDemo {
  public static void main(String[] args) throws InterruptedException {
    //예외처리 1번: try - catch문
//    try {
//      System.out.println("1초간 쉽니다.");
//      Thread.sleep(1000);
//      System.out.println("1초간 쉽니다.");
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }

    //예외처리 2번: throws exception
    Thread.sleep(1000);
  }
}
