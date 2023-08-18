package challengeCh6;

public class Ch6_13_Member {
  String name;
  String id;
  String password;
  int age;

  public Ch6_13_Member(String name, String id, String password, int age){
    this.name = name;
    this.id = id;
    this.password = password;
    this.age = age;
  }

  public String findName(String id){
    return name;
  }
}