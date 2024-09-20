package chap11.queue;

public class Message {
    String command;  // sendMail, ...
    String to;  // 수신인

    public Message(String command, String to){
        this.command = command;
        this.to = to;
    }


}
