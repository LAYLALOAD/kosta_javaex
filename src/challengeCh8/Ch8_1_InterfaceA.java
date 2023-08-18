package challengeCh8;

public interface Ch8_1_InterfaceA {
  void method1();
}

class A implements Ch8_1_InterfaceA {
  @Override
  public void method1() {
    System.out.println("A의 method 입니다.");
  }
}

class B implements Ch8_1_InterfaceA {
  @Override
  public void method1() {
    System.out.println("B의 method 입니다.");
  }
}
