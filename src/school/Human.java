package school;

public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age){
        setName(name);
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
