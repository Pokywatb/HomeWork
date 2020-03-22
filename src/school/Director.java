package school;

public class Director extends Human {

    public Director(String name, int age) {
        super(name, age);
    }

    void start(){
        System.out.println("Начало занятий");
    }

    void stop(){
        System.out.println("Конец занятий");
    }



}
