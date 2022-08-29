package net.study.basepatterns.behavioral.chain;

public abstract class MessageSender {
    private int priority;
    private MessageSender nextMessage;

    public MessageSender(int priority) {
        this.priority = priority;
    }

    public void setNextMessage(MessageSender nextMessage) {
        this.nextMessage = nextMessage;
    }

    public void notifyPerson (String message, int level){
        if(level >= priority){
            send(message);
        }
        if(nextMessage !=null){
            nextMessage.notifyPerson(message,level);
        }
    }

    public abstract void send(String message);


}
