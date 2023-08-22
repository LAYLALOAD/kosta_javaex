package challengeCh8;

public class Setting {
  static DataAccessObject exchange(){
    return //new OracleDao();
        new MySqlDao();
  }
}
