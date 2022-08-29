package net.study.basepatterns.structural.proxy;

public class LabRunner {
    public static void main(String[] args) {
        Lab lab = new ProxyLab(" https://www.lab.com");

        lab.run();
    }
}
