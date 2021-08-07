import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "User1", "Last1"));
        employeeList.add(new Employee(3, "User3", "Last3"));
        employeeList.add(new Employee(4, "User4", "Last4"));
        employeeList.add(new Employee(5, "User5", "Last5"));
        employeeList.add(new Employee(2, "User2", "Last2"));

        Collections.sort(employeeList);
        employeeList.forEach(employee -> {
            System.out.println(employee.getId());
        });
    }
}

class Employee implements Comparable<Employee>{

    private int id;
    private String firstName;
    private String lastName;


    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }
}