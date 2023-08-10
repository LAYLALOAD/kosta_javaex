package control;

import java.util.Scanner;

public class Switch3Ex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("동물의 이름을 입력 하세요.");
    String bio = in.nextLine();
    String kind = "";

    //if문
    if (bio.equals("호랑이") || bio.equals("사자")) {
      kind = "포유류";
    } else if (bio.equals("독수리") || bio.equals("참새")) {
      kind = "조류";
    } else { // kind 초기값을 ""으로 두지 않을 경우 else 해당없음을 넣는 것이 가장 좋다.
      kind = "해당 없음";
    }
    System.out.printf("%s는 %s입니다.\n", bio, kind);

    //switch 문 (if -> switch문으로 변환)
    System.out.println("동물의 이름을 입력 하세요.");
    bio = in.nextLine();
    kind = ""; //초기화를 빈 문자로 넣어 주면 좋다.
    switch (bio) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "독수리":
      case "참새":
        kind = "조류";
        break;
      default: // kind 초기값을 ""으로 두지 않을 경우 default 해당없음을 넣는것이 가장 좋다.
        kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다. %d 글자입니다.\n", bio, kind, kind.length()); //kind 초기값을 null로 두게 되면 kind.length 출력시 NullPointerException발생 -> 해결방법: 초기화 값을 빈 문자열로 넣을 것 (""), 참조형 데이터는 null이 아닌 빈 객체(비어있는 문자열)로 두는 것을 권장함

//    //개선된 switch문 (나중에 마져 하기 YJ 직접!!!!!!)
//    switch (bio) {
//      case "호랑이", "사자"        -> System.out.println("포유류");
//      case "독수리", "참새"        -> System.out.println("조류");
//      default:
//        System.out.println("해당 없음");
//        yield "...";
//    }

  }
}
