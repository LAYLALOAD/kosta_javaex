package challengeCh6;

public class PhoneTest {
  public static void main(String[] args) {
    Phone[] phones = {
        new Phone("황진이"),
        new Telephone("길동이", "내일"),
        new SmartPhone("민국이", "갤러그")
    };

    for (Phone phone : phones) {
      if(phone instanceof SmartPhone) {
        ((SmartPhone) phone).playGame();
      } else if (phone instanceof Telephone) {
        ((Telephone) phone).autoAnswering();
      } else {
        phone.talk();
      }
    }
  }
}

class Phone{
  protected String owner;
  public Phone(String owner){
    this.owner = owner;
  }
  void talk(){
    System.out.println(owner + "가 통화중입니다.");
  }
}

class Telephone extends Phone {
  private String when;

  public Telephone(String name){
    super(name);
  }
  public Telephone(String name, String when){
    this(name);
    this.when = when;
  }
  void autoAnswering(){
    System.out.println(owner + "가 통화중입니다." + when + "에 전화바랍니다.");
  }
}

class SmartPhone extends Telephone {
  private String game;

  public SmartPhone(String name){
    super(name);
  }

  public SmartPhone(String name, String game){
    this(name);
    this.game = game;
  }
  void playGame(){
    System.out.println(owner + "가 "+ game + "게임 중입니다.");
  }
}