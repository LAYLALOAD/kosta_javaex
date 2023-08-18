package challengeCh7;

public abstract class Ch7_10_Machine {
  public void powerOn() {}
  public void powerOff() {}
  public abstract void work();
}

class Computer extends Ch7_10_Machine {

  @Override
  public void work() {

  }
}

