package listHomeWork.hw;

// Создать список объетов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплете
// имени, зарплете, возрасту и компании


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    // TODO: конструктор, геттеры и сеттеры

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[(int) (Math.random() * names.length)], companies[(int) (Math.random() * companies.length)], (int) (Math.random() * 40000 + 20000), (int) (Math.random() * 40 + 21))); // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
        }
        System.out.println(Arrays.toString(employees.toArray()));
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> employees = employeeGenerator(13);
        EmployeeAgeComparator age = new EmployeeAgeComparator();
        employees.sort(age);
        System.out.println(Arrays.toString(employees.toArray()));
        EmployeeNameComparator name = new EmployeeNameComparator();
        employees.sort(name);
        System.out.println(Arrays.toString(employees.toArray()));
        Comparator<Employee> comparator = new EmployeeAgeComparator().thenComparing(new EmployeeNameComparator().thenComparing(new EmployeeCompanyComparator().thenComparing(new EmployeeSalaryComparator())));
        employees.sort(comparator);
        System.out.println(Arrays.toString(employees.toArray()));



    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(getAge(), o.getAge());
    }
}

class EmployeeNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class EmployeeAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class EmployeeCompanyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}

class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
