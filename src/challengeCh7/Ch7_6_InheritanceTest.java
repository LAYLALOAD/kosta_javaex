package challengeCh7;

public class Ch7_6_InheritanceTest {
}

class Parent {
  public String name;

  public Parent(String name) {
    this.name = name;
  }
}

class Child extends Parent {
  public int studnetNo;

  public Child(String name, int studnetNo) {
    super(name);
    //this.name = name;
    this.studnetNo = studnetNo;
  }
}
