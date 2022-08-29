package net.study.basepatterns.behavioral.chain;

public class Notifier {
    public static void main(String[] args) {
        MessageSender notifier = new Reporter(Priority.NOTIMPORTANT);
        MessageSender notifier2 = new MiddleImportanceNotifier(Priority.IMPORTANT);
        MessageSender notifier3 = new HighImportanceNotifier(Priority.VERYIMPORTANT);

        notifier.setNextMessage(notifier2);
        notifier2.setNextMessage(notifier3);

        notifier.notifyPerson("Doing OK", Priority.NOTIMPORTANT);
        notifier.notifyPerson("Business is going hard", Priority.IMPORTANT);
        notifier.notifyPerson("Everything is going wrong", Priority.VERYIMPORTANT);

    }
}
