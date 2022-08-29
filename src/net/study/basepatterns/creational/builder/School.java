package net.study.basepatterns.creational.builder;

public class School {
    private String name;
    private int studentAmount;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentAmount(int studentAmount) {
        this.studentAmount = studentAmount;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", StudentAmount=" + studentAmount +
                '}';
    }
}
