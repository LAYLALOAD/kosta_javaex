package challengeCh9;

public class Chatting {
  class Chat {
    void start() {}

    void sendMessage(String message) {}
  }

  void startChart(String chatId) {
    String nickName = chatId;
    System.out.println(nickName);

    Chat chat = new Chat() {
    @Override
    public void start() {
      while (true) {
        String inputData = "안녕하세요";
        String message = "[" + nickName + "]" + inputData;
        sendMessage(message);
      }
    }
  };

     chat.start();
  }
}

