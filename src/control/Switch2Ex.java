package control;

public class Switch2Ex { //메소드가 2개
  public static void main(String[] args) {
    whoIsIt("호랑이"); //bio는 information으로 직접 타이핑 하지 않는다.
    whoIsIt("독수리");    
    whoIsIt("매미");
  }
  
  static void whoIsIt(String bio) {
    String kind = ""; //defalut를 null 보다는 ""(공백)으로 두어라 -> null로 두면 아래에 가서 오류가 생길 수 있음,  기본값이 널이기 때 공백으로라도 둬라, 객체에서 가장 흔한게 NullPointerException
    switch (bio) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "독수리":
      case "참새":
        kind = "조류";
        break;
      case "고등어":
        kind = "어류";
      default:
        kind="해당없음";
    }
    System.out.printf("%s는 %s입니다.\n", bio, kind);
    return; //메서드는 리턴을 만나야 종료된다. void는 보이지 않으나 return이 있긴 하다.
  }
}
