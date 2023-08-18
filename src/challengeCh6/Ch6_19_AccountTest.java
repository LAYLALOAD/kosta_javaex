package challengeCh6;

public class Ch6_19_AccountTest {
  public static void main(String[] args) {
    Ch6_19_Account account = new Ch6_19_Account();
    account.setBalance(10_000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(-1000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(2_000_000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(300_000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.withdraw(300_000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.deposit(1_000_000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.deposit(100);
    System.out.println("현재 잔고: " + account.getBalance());
  }
}

