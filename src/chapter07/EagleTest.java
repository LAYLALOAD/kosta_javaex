package chapter07;

public class EagleTest {
  public static void main(String[] args) {
    ABird b = new ABird(){
      void fly(){
        System.out.println("독수리가 날아간다.");
      }
    };
    b.fly();
  }
}
