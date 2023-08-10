package method;

public class MethodEx {
  public static void main(String[] args) {

//    //메서드를 이용하지 않은 합 예제
//    //1~10까지의 합
//    int sum = 0;
//    for (int i = 1; i <= 10; i++) {
//      sum += i; // sum = sum + i;
//    }
//    System.out.println("sum(1~10) = " + sum);
//
//    //10~100까지의 합
//    sum = 0;
//    for (int i = 10; i <= 100; i++) {
//      sum += i;
//    }
//    System.out.println("sum(10~100) = " + sum);
//
//    //100~1000까지의 합
//    sum = 0;
//    for (int i = 100; i <= 1000; i++) {
//      sum += i;
//    }
//    System.out.println("sum(100~1000) = " + sum);


//    //중첩 for문을 활용한 합 예제
//    //1~10까지의 합 3번 반복 (재사용은 못함)
//    for(int j = 0; j < 3; j++) {
//      int sum = 0;
//      for(int i=1; i <= 10; i++) {
//        sum += i;
//      }
//      System.out.println("sum(1~10) = " + sum);
//    }


//    //반환값이 없을때
//    //메서드 호출 (명령하는 것) - 반환값이 없을때 void 활용
//    sum(1,10);
//    sum(10,100);
//    sum(100,1000);


//    //반환값이 있을때 (void -> int)
//    //메서드 호출 (명령하는 것)
//    System.out.printf("sum(1~10) = %d\n", sum(1,10)); // 반환값이 있을때 표현
//    System.out.printf("sum(1~10) = %d\n", sum(10,100)); // 반환값이 있을때 표현
//    System.out.printf("sum(1~10) = %d\n", sum(100,1000)); // 반환값이 있을때 표현


    //type을 int에서 long으로 변환할때
    //메서드 호출 (명령하는 것)
    System.out.printf("sum(1~10) = %d\n", sum(1, 10L));
    System.out.printf("sum(10~100) = %d\n", sum(10, 100L));
    System.out.printf("sum(100~1000) = %d\n", sum(1_000_000_000, 2_000_000_000));


  }//main

//    //반환값이 없을때
//    //메서드 활용 (코드의 재사용성 도모)
//    //메서드 안의 실행문들을 전부 실행하고 끝남
//    static void sum(int num1, int num2) {
//      int sum = 0;
//      for(int i = num1; i <= num2; i++) {
//        sum += i;
//      }
//      System.out.printf("sum(%d~%d) = %d\n", num1, num2, sum); //반환값이 없을때
//    }


//    //반환값이 있을때
//    //메서드 활용 (코드의 재사용성 도모)
//    //메서드 안의 실행문들을 전부 실행하고 끝남
//    static int sum(int num1, int num2) {
//      int sum = 0;
//      for(int i = num1; i <= num2; i++) {
//        sum += i;
//      }
//      return sum;
//    }


  //type을 int에서 long으로 변환할때
  //반환값이 있을때
  //메서드 활용 (코드의 재사용성 도모)
  //메서드 안의 실행문들을 전부 실행하고 끝남
  static long sum(long num1, long num2) {
    long sum = 0;
    for(long i=num1; i<=num2; i++) {
      sum += i;
    }
    return sum;
  }


}//class