package challengeCh7;

public class Ch7_11_Activity {
  public void onCreate(){
    System.out.println("기본적인 실행 내용");
  }
}

class MainActivity extends Ch7_11_Activity {
  @Override
  public void onCreate() {
    super.onCreate();
    System.out.println("추가적인 실행 내용");
  }
}
