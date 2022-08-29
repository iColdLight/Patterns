package net.study.basepatterns.behavioral.interpreter;

public class TerminalExpression implements Expression{
    private String knowledge;

    public TerminalExpression(String knowledge) {
        this.knowledge = knowledge;
    }


    @Override
    public boolean interpret(String context) {
        if (context.contains(knowledge)){
            return true;
        }return false;
    }
}
