package net.study.basepatterns.behavioral.iterator;

public class Scientist implements Collection {
    private String name;
    private String[] knowledge;

    public Scientist(String name, String[] knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String[] knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public Iterator getIterator() {
        return new KnowledgeIterator();
    }

    private class KnowledgeIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index<knowledge.length){
                return true;
            }return false;
        }

        @Override
        public Object next() {
            return knowledge[index++];
        }
    }
}
