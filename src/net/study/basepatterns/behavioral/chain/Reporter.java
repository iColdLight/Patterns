package net.study.basepatterns.behavioral.chain;

public class Reporter extends MessageSender {

    public Reporter(int priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        System.out.println("Report sent message: " + message);
    }
}
