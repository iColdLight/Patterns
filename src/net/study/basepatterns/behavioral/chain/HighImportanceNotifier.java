package net.study.basepatterns.behavioral.chain;

public class HighImportanceNotifier extends MessageSender{
    public HighImportanceNotifier(int priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        System.out.println("Send high importance notifier: " + message);
    }

}
