package classExample;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(10.0); //외부에 은닉하는 값을 쓰기 위해서는 set을 써라
    System.out.println("circle = " + circle); // 객체를 찍으면 그 객체가 있는 주소가 나옴
    System.out.println("circle.radius = " + circle.getRadius()); //값
  }
  //캡슐화 연습
}

 class Circle {
   private double radius = 0.0; //class 안에서만 사용하는 private

   public Circle() {
   }

   public Circle(double radius) {
     this.radius = radius;
   }

   public double getRadius() {
     return radius;
   }

   public void setRadius(double radius) {
     this.radius = radius; //this를 안붙히면 스택영역에 들어있는 가까운 걸로 인식, this를 붙히면 객체 나 자신(전역변수 radius)을 쓰겠다.
   }
 }
