package chapter06;

public class Box {
  String name;
  public Box(){}
  public Box(String name) { //명시적 생성자
    this.name = name;
  }
}

class ColoredBox extends Box {

  public ColoredBox(String name) {
    super(name);
  }

  public ColoredBox() {}
}
