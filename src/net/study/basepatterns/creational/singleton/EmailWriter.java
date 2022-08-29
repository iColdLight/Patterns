package net.study.basepatterns.creational.singleton;

public class EmailWriter {
    private static EmailWriter emailWriter;
    private static String email = "Your new email... \n";

    public static synchronized EmailWriter getEmailWriter(){
        if(emailWriter == null){
            emailWriter = new EmailWriter();
        }
        return emailWriter;
    }

    private EmailWriter() {
    }

    public void addToEmail(String text){
        email += text + "\n";
    }

    public void showEmail(){
        System.out.println(email);
    }


}
