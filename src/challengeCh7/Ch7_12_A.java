package challengeCh7;

public class Ch7_12_A {
  public void method1() {
    System.out.println("A-method1()");
  }
}

class B extends Ch7_12_A {
  public void method1(){
    System.out.println("B-method1()");
  }
}

class C extends Ch7_12_A {
  public void method1() {
    System.out.println("C-method1()");
  }
  public void method2() {
    System.out.println("C-method2()");
  }
}
