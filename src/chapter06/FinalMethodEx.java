package chapter06;

public class FinalMethodEx {
  public static void main(String[] args) {

  }
}

class Chess {
  enum ChessPlayer {
    white, Black
  }
  ChessPlayer getFirstPlayer(){
    return ChessPlayer.white;
  }
}

class WorldChess extends Chess{
  @Override
  ChessPlayer getFirstPlayer() {
    return super.getFirstPlayer();

  }
}
