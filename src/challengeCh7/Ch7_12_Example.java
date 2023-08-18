package challengeCh7;

public class Ch7_12_Example {
  public static void action(Ch7_12_A a){
    a.method1();
    if(a instanceof C){
      C c = (C)a;
      c.method2();
    }
    if(a instanceof C c) {
      c.method2();
    }
  }

  public static void main(String[] args) {
    action(new Ch7_12_A());
    action(new B());
    action(new C());
  }
}
