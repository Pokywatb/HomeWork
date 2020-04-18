package enumwork;

public class User {

    private String fulName;
    private int salary;
    private Position position;

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "User{" +
                "fulName='" + fulName + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}
