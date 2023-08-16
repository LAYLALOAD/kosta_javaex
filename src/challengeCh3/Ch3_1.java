package challengeCh3;

public class Ch3_1 {
  public static void main(String[] args) {
    //전위연산자, 후위연산자 (11+20=31)
    int x = 10;
    int y = 20;
    int z = (++x) + (y--);
    System.out.println(z);

  }
}
