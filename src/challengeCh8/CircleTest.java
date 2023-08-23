package challengeCh8;

public class CircleTest { //Object이 가진 메소드를 오버라이딩 하는 것이 핵심
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    if(c1.equals(c2))
      System.out.println("c1과 c2는 같다.");
    else
      System.out.println("c1과 c2는 다르다.");
  }
}

class Circle {
  int radius;
  public Circle(int radius) {
    this.radius = radius;
  }

//  // 오버로딩
//  public boolean equals(Circle circle) {
//    if(this.radius == circle.radius) {
//      return true;
//    }
//    return false;
//  }

  // 오버라이딩
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Circle circle) {
      if(circle != null && this.radius == circle.radius) {
        return true;
      }
    }
    return false;
  }
}

