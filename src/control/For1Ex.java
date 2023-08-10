package control;

public class For1Ex {
  public static void main(String[] args) {
//    //for 문
//    for(int i = 0; i < 10; i++) { //2씩 증가시: i+=2
//      System.out.println("hello world" + (i+1));
//    }

//    //while 문을 조건식 활용하여 10번 반복하기
//    int i = 0; // 초기식을 앞으로 빼준다.
//    while (i <10) { //while문은 보통 무한반복으로 사용해서 break를 걸어 탈출 할 수 있도록 주로 쓴다.
//      System.out.println("hello world" + (i+1));
//      i++;
//    }

    //while 문 무한반복하되 break 활용하여 10번찍고 빠져 나오도록 작성
    int i = 0;
    while (true) {
      System.out.println("hello world" + (i+1));
      i++;
      if(i == 10) {
        break;
      }
    }
  }
}
