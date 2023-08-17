package challengeCh6;

public class OvershadowTest {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();
  }
}

class Parent {
  String name = "영조";
  void print(){
    System.out.println("영조입니다.");
  }
}

class Child extends Parent {
  String name = "사도세자";
  void print(){
    System.out.println("사도세자 입니다.");
  }
}
