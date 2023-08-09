package sample;

public class InputOutput {
  public static void main(String[] args) {
//    Scanner scanner =  new Scanner(System.in); //데이터 타입(객체, 대문자) :Scanner, 변수 이름(소문자) : scanner
//    int i = scanner.nextInt(); //입력 받은 숫자를 i에 저장함
//    System.out.println(i);

//    String s = scanner.nextLine(); //숫자든 문자든 입력 하면 모두 문자 열로 받겠다. s에 저장함
//    int i2 = Integer.parseInt(s); //받은 문자 열이 숫자로 형변환 되서
//    System.out.println(i2); //출력됨

    //산술 연산자 (산술 변환)
    int a = 1_000_000;
    int b = 2_000_000;
    long c = a * (long)b; //데이터 타입을 int 로 하게 되면 오류 -> long 으로 타입 변환, 두 수 중 한개 long 으로 변환
    System.out.println("c = " + c);

    //산술 연산자 (피 연산자 0일때)
//    int res = 5/0;
//    System.out.println("res = " + res); //exception 오류(안착한 오류): compile(착한 오류, 문제가 생기면 이쪽 으로 옮길 수 있도록 해야 한다.) 할때는 괜찮 은데 runtime 오류 발생

    double res1 = 5/0.0;
    double r = 5 % 0.0;
    boolean b1 = Double.isInfinite(res1);
    boolean b2 = Double.isNaN(r);
    System.out.println("res1 = " + (res1 + 2));
    System.out.println("r = " + (r + 2));
    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);

  }
}
