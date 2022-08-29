package net.study.basepatterns.behavioral.mediator;

public class Telegram {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        User admin = new Admin(textChat);
        User u1 = new RegularUser(textChat);
        User u2 = new RegularUser(textChat);

        textChat.setAdmin(admin);
        textChat.addUser(u1);
        textChat.addUser(u2);

        u1.sendMessage("Hi, everyone!");
        admin.sendMessage("Hi, I am admin");

    }
}
