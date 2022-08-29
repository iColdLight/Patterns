package net.study.basepatterns.structural.proxy;

public class ProxyLab implements Lab{
    private String address;
    private MainLab mainLab;

    public ProxyLab(String address) {
        this.address = address;
    }

    @Override
    public void run() {
        if(mainLab == null){
            mainLab = new MainLab(address);
        }
        mainLab.run();
    }
}
