package challengeCh8;

public interface Ch8_1_Database {
  void use();
}

class MySQL implements Ch8_1_Database {
  @Override
  public void use() {
    System.out.println("MySQL을 사용한다.");
  }
}

class Oracle implements Ch8_1_Database {
  @Override
  public void use() {
    System.out.println("Oracle을 사용한다.");
  }
}
