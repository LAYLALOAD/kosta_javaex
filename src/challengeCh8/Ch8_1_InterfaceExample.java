package challengeCh8;

public class Ch8_1_InterfaceExample {
  public static void main(String[] args) {
//    A a = new A();
//    B b = new B();
//    a.method1();
//    b.method1();

    Ch8_1_InterfaceA ia = new A();
    ia.method1();
    ia = new B();
    ia.method1();
  }
}
