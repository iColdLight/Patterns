package net.study.basepatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isChem = getChemExpression();
        Expression isBio = getBioExpression();

        System.out.println("Does person knows chemistry: " + isChem.interpret("Organic Chemistry"));
        System.out.println("Does person knows biology: " + isBio.interpret("Anatomy Ecology"));
    }

    public static Expression getChemExpression(){
        Expression chem1 = new TerminalExpression("Organic Chemistry");
        Expression chem2 = new TerminalExpression("Inorganic Chemistry");

        return new OrExpression(chem1, chem2);
    }

    public static Expression getBioExpression(){
        Expression bio1 = new TerminalExpression("Anatomy");
        Expression bio2 = new TerminalExpression("Ecology");

        return new AndExpression(bio1, bio2);
    }
}
