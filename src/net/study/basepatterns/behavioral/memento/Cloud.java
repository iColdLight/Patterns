package net.study.basepatterns.behavioral.memento;

public class Cloud {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
