package challengeCh6;

public class Ch6_18_ShopServiceTest {
  public static void main(String[] args) {
    Ch6_18_ShopService s1 = Ch6_18_ShopService.getInstance();
    Ch6_18_ShopService s2 = Ch6_18_ShopService.getInstance();
    Object o1 = new Object();
    Object o2 = new Object();
    if(s1 == s1) {
      System.out.println("같은 객체입니다.");
    } else {
      System.out.println("다른 객체입니다.");
    }

    if(o1 == o2) {
      System.out.println("같은 객체입니다.");
    } else {
      System.out.println("다른 객체입니다.");
    }

  }
}
