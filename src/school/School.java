package school;

import java.util.Objects;

public class School {
    protected final String name;
    protected Director director;
    protected Teacher[] teachers = new Teacher[8];
    protected Student[] students = new Student[8];

    public School(String name) {
        this.name = name;
    }


    public void schoolDay() {
        if (director.name == null) {
            System.out.println("Без директора школа не работает.");
        } else {
            director.start();
            for (Teacher teacheR : teachers) {
                if(teacheR != null){
                for (Student studenT : students) {
                    if (studenT.learn == teacheR.tought) {
                        studenT.learns(teacheR);
                    }
                    break;
                }

            }}
            director.stop();
        }

    }


    public void addStudent(Student newStud) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStud;
                break;
            }
        }
    }

    public void addTeacher(Teacher newTeacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = newTeacher;
                break;
            }
        }
    }
    public void addDirector (Director newDirector) {
        if (director == null){
            director = newDirector;

        }
    }

}
