package method;

public class MethodOverloading {
  public static void main(String[] args) {
    System.out.println(sum(1, 2));
    System.out.println(sum(1, 2, 3));
    System.out.println(sum(10L, 20L, 30L));

  }

  static int sum(int i, int j) {
    return i + j;
  }

  //오버로딩 (매개변수 갯수 달라짐)
  static int sum(int i, int j, int k) {
    return i + j + k;
  }

  //오버로딩 (매개변수 타입 달라짐)
  static long sum(long i, long j, long k) {
    return i + j + k;
  }

//  //오버로딩 오류 예제 (리턴타입을 int를 long으로만 바꾸면 오버로딩에 해당하지 않음, 매개변수의 변화가 있어야 함)
//  static long sum(int i, int j) {
//    return i + j;
//  }
}
