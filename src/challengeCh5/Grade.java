package challengeCh5;

public enum Grade {
  A("EXCELLENT"), B("GOOD"), C("SOSO");
  //필드 선언
  private String grade;
  //생성자 선언
  private Grade(){}
  private Grade(String grade){
    this.grade = grade;
  }
  //메서드
  public String getGrade(){
    return grade;
  }
}
