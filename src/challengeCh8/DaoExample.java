package challengeCh8;

public class DaoExample {
  public static void dbWork(DataAccessObject dao) {
    dao.select();
    dao.insert();
    dao.update();
    dao.delete();
  }

  public static void main(String[] args) {
    //dbWork(new OracleDao());
    dbWork(Setting.exchange());
  }
}

interface DataAccessObject {
  void select();
  void insert();
  void update();
  void delete();
}

class OracleDao implements DataAccessObject{
  String dbName = "Oracle DB";
  @Override
  public void select() {
    System.out.println(dbName + "에서 검색");
  }

  @Override
  public void insert() {
    System.out.println(dbName + "에서 삽입");
  }

  @Override
  public void update() {
    System.out.println(dbName + "에서 수정");
  }

  @Override
  public void delete() {
    System.out.println(dbName + "에서 삭제");
  }
}

class MySqlDao implements DataAccessObject{
  String dbName = "MySql DB";
  @Override
  public void select() {
    System.out.println(dbName + "에서 검색");
  }

  @Override
  public void insert() {
    System.out.println(dbName + "에서 삽입");
  }

  @Override
  public void update() {
    System.out.println(dbName + "에서 수정");
  }

  @Override
  public void delete() {
    System.out.println(dbName + "에서 삭제");
  }
}
