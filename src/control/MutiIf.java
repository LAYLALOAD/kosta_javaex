package control;

import java.util.Scanner;

public class MutiIf {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력 해 주세요. (0~100)");
    int score = in.nextInt();
    String grade = "";
//    //여러 반복문을 통해서 점수 내기
//    if (score >= 90 && score <= 100) { //&& score <= 100넣지 않아도 되는 이유는 else 로 상위 코드 부터 순차적 으로 걸러짐, 점수가 높은 것부터 적을 것
//      grade = "A";
//    } else if (score >= 80 && score < 90) {
//      grade = "B";
//    } else if (score >= 70) {
//      grade = "C";
//    } else if (score >= 60) {
//      grade = "D";
//    } else {
//      grade = "F";
//    }
//    System.out.println("your grade is " + grade);

    //중첩 if문
    if (score >= 90) {
      if(score > 95) { //한줄만 있더라도 중괄호를 넣는 이유는 향후 복잡도가 올라갈때 가독성을 높이기 위함
        grade = "A+";
      } else {
        grade = "A0";
      }
    } else if (score >= 80) {
      if (score >=85) {
        grade = "B+";
      } else {
        grade = "B0";
      }
    } else if (score >= 70) {
      grade = "C";
    } else if (score >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }
    System.out.println("your grade is " + grade);


  }
}
