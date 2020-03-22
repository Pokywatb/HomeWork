package school;

public class Teacher extends Human implements CanGiveKnowledge {
    protected String tought; //  преподаваемый предмет.

    public Teacher(String name, int age, String tought) {
        super(name, age);
        setTought(tought);
    }


    public String getTought() {
        return tought;
    }

    public void setTought(String tought) {
        this.tought = tought;
    }


    @Override
    public void teach(CanGetKnowledge human) {

    }
}
