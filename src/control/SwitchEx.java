package control;

public class SwitchEx {
  public static void main(String[] args) {
    int number = 1; //선언과 동시에 초기화

//    //switch는 break를 넣지 않으면 아래로 계속 흐른다
//    switch (number) {
//      case 3 :
//        System.out.print("*");
//      case 2 :
//        System.out.print("*");
//      case 1 :
//        System.out.print("*");

    //switch는 break를 넣어야 조건 만족시 멈추게 된다.
    switch (number) {
      case 3 :
        System.out.print("*");
        break;
      case 2 :
        System.out.print("*");
        break;
      case 1 :
        System.out.print("*");




    }
  }
}
