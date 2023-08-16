package chapter05;

import java.util.Arrays;

public class FindMax {
  public static void main(String[] args) {
    int[] numbers = {2,3,10,1,8};
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if(numbers[i] > max) max = numbers[i];
    }
    System.out.println("max = " + max);
    System.out.println(Arrays.toString(numbers));

    // 알고리즘을 알려면 위와 같이 해야하나 코딩테스트용으로는 아래와 같이
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    System.out.println("max = " + numbers[numbers.length-1]); //max는 sort를 진행한 후 맨 오른쪽 것을 출력하면 된다.
  }
}
