package challengeCh6;

public class Ch6_13_MemberServiceTest {
  public static void main(String[] args) {
    Ch6_13_MemberService memberService = new Ch6_13_MemberService();
    Ch6_13_Member[] members = {
        new Ch6_13_Member("홍길동", "hong", "12345", 20),
        new Ch6_13_Member("김연아", "kim", "qwert", 20)
    };
    String id = "kim";
    boolean result = memberService.login(id, "qwert");
    if(result) {
      for (Ch6_13_Member member : members) {
        if(member.id.equals(id)){
          System.out.println(member.findName(id) + "님 반갑습니다.");
        }
      }
      System.out.println("로그인 되었습니다.");
      memberService.logout(id);
    } else {
      System.out.println("id 혹은 password가 올바르지 않습니다.");
    }
    result = memberService.login("error", "12345");
    if(result) {
      System.out.println("로그인 되었습니다.");
      memberService.logout("hong");
    } else {
      System.out.println("id 혹은 password가 올바르지 않습니다.");
    }
  }
}