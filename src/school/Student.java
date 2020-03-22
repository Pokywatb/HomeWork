package school;

public class Student extends Human implements CanGetKnowledge {
    protected int knowledgeLVL;
    protected String learn;// Изучаемый предмет

    public Student(String name, int age, int knowledgeLVL, String learn) {
        super(name, age);
        setKnowledgeLVL(knowledgeLVL);
        setLearn(learn);
           }


    public int getKnowledgeLVL() {
        return knowledgeLVL;
    }

    public void setKnowledgeLVL(int knowledgeLVL) {
        this.knowledgeLVL = knowledgeLVL;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }


    @Override
    public void learns(CanGiveKnowledge human) {
        knowledgeLVL++;
    }

}
