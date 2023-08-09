package sample;

public class TernaryEx {
  public static void main(String[] args) {
    //조건 연산자 (쇼트 서킷 로직 이용)
    int x = 2;
    int y;
    y = (x == 1) ? 10 : 20;
    System.out.println("y = " + y);
  }
}
