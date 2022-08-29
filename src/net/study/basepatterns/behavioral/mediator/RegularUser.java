package net.study.basepatterns.behavioral.mediator;

public class RegularUser implements User{
    Chat chat;

    public RegularUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User gets message " + message);
    }
}
