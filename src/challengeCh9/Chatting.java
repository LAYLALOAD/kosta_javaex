package challengeCh9;

public class Chatting {
  class Chat {
    void start() {}
    // 이것이 자바다 교재 404 page 참고
    // 로컬변수를 로컬클래스에서
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
}//365800

