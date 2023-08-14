package chapter05;

public class ArrayStringEx {
  public static void main(String[] args) {
    String[] names = new String[3];
    for (String name : names ) {
      System.out.println(name);
    }
    names[0] = "kim"; //String의 특징으로 자기 자신을 출력함 (리터럴 같이)
    names[1] = "lee";
    names[2] = "park";
    for (String name : names) {
      System.out.println(name);
    }
  }
}
