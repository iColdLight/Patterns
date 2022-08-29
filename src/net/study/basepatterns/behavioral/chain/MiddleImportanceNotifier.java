package net.study.basepatterns.behavioral.chain;

public class MiddleImportanceNotifier extends MessageSender{
    public MiddleImportanceNotifier(int priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        System.out.println("Send middle importance notifier: " + message);
    }

}
