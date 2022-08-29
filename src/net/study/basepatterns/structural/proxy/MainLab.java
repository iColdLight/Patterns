package net.study.basepatterns.structural.proxy;

public class MainLab implements Lab{
    private String address;

    public MainLab(String address) {
        this.address = address;
        goToWork();
    }

    public void goToWork(){
        System.out.println("Going to the lab by address" + address);
    }

    @Override
    public void run() {
        System.out.println("Work is going" + address);
    }
}
