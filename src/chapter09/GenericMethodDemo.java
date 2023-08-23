package chapter09;

public class GenericMethodDemo {
  public static void main(String[] args) {
    Integer[] ia = {1,2,3,4,5};
    Character[] ca = {'a', 'b','c','d','e'};
    Box[] ba = {new Box(), new Box()};
    ba[0].set(10);
    ba[1].set(20);
    Utils.showArray(ia); // [1,2,3,4,5]
    Utils.showArray(ca); // abcde
    Utils.showArray(ba);
    System.out.println(Utils.getLast(ia)); // 5
    System.out.println(Utils.getLast(ca)); // e
  }
}

class Utils {
//  static void showArray(Integer[] array) {
//    System.out.println(Arrays.toString(array));
//  }
//
//  static void showArray(Character[] array) {
//    System.out.println(Arrays.toString(array));
//  }

  //제너릭 메소드 (매개변수를 제너릭 메소드로 갖는)
  static <T> void showArray(T[] array) {
    for (T t : array) {
      System.out.printf("%s ", t);
    }
    System.out.println();
  }

  //제너릭 메소드 (매개변수도 리턴도 제너릭 메소드로 갖는)
  static <T> T getLast(T[] array) {
    return array[array.length - 1];
  }

}
