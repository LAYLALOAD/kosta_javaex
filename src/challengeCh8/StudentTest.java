package challengeCh8;


public class StudentTest {
  public static void main(String[] args) {
    System.out.println(new Student("김삿갓"));
    System.out.println(new Student("홍길동"));
  }

  public StudentTest(String name) {

  }
}

class Student {
  String name;

  public Student (String name) {
    this.name = name;
  }

  @Override //alt+insert -> toString
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        '}';
  }
}



