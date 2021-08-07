import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "User1", "Last1"));
        personList.add(new Person(3, "User3", "Last3"));
        personList.add(new Person(4, "User4", "Last4"));
        personList.add(new Person(5, "User5", "Last5"));
        personList.add(new Person(2, "User6", "Last6"));
        personList.add(new Person(6, "User2", "Last2"));


        Comparator<Person> idComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        };

        Comparator<Person> firstNameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        Collections.sort(personList, idComparator);
        personList.forEach(Person -> {
            System.out.println(Person.getId());
        });

        Collections.sort(personList, firstNameComparator);
        personList.forEach(Person -> {
            System.out.println(Person.getFirstName());
        });
    }
}

class Person{

    private int id;
    private String firstName;
    private String lastName;


    public Person(int id, String firstName, String lastName) {
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

}
