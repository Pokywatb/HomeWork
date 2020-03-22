package school;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        School school1 = new School("aaaa", "Василий Задов");
        System.out.println(school1.name);

        Director dir1 = new Director("Василий Задов", 64);
        Teacher teacher1 = new Teacher("Клара Захаровна", 62, "Химия");
        Student stud1 = new Student("Павел Задов", 12, 5, "Химия");

        school1.addStudent(stud1);
        school1.addTeacher(teacher1);

        System.out.println(Arrays.toString(school1.teachers));

        school1.schoolDay(school1.teachers, school1.students, dir1);


    }
}
