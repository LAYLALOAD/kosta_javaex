package chapter05;

public class VarArgsEx {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    printSum(1, 2, 3, 4, 5);
    printSum(10,20,30);
    printSum(numbers);
  }
  static void printSum(int...number){ //가변개수인자를 ...을 이용해서 활용할 수 있다.
    int sum = 0;
    for (int num : number) {
      sum += num;
    }
    System.out.println("sum = " + sum);
  }
}
