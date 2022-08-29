package net.study.basepatterns.behavioral.iterator;

public class ScientistRunner {
    public static void main(String[] args) {
        String[] knowledge = {"Biology", "Math", "Chemistry", "Physics"};
        String[] knowledge2 = {"Biology", "Algebra", "Trigonometry", "Calculus"};

        Scientist Ivan = new Scientist("Ivan", knowledge);
        Scientist Gena = new Scientist("Gena", knowledge2);

        Iterator iterator = Ivan.getIterator();
        System.out.println("Scientist: " + Ivan.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }

        Iterator iterator2 = Gena.getIterator();
        System.out.println("Scientist: " + Gena.getName());
        System.out.println("Skills: ");

        while (iterator2.hasNext()){
            System.out.println(iterator2.next().toString() + " ");
        }
    }
}
