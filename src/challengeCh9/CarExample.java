package challengeCh9;


public class CarExample {
  public static void main(String[] args) {
    Car myCar = new Car();
    Car.Tire tire = myCar.new Tire();
    Car.Engin engin = new Car.Engin();
  }
}

class Car {
  class Tire {}
  static class Engin {}
}
