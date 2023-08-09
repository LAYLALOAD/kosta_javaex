package sample;

public class OperatorEx {
  public static void main(String[] args) {
//    int i = 0;
//    ++i;
//    System.out.println("i = " + i);
//    int j = 0;
//    j++;
//    System.out.println("j = " + j);

    int i = 0;
    int j = ++i; //참조하기 전에 더한다. (전위 연산자)
    // 위 행이 헛갈린다면 아래와 같이 나눠서 생각해 보기.
//    ++i;
//    int j = i;

    System.out.printf("i = %d and j = %d", i,j);

    int l = 0;
    int m =l++; //먼저 참조하고 더한다. 후위 연산자
    // 위 행이 헛갈린다면 아래와 같이 나눠서 생각해 보기.
//    l++;
//    int m = l;
    System.out.printf("l = %d and m = %d", l, m);

  }
}
