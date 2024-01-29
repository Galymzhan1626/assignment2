import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Galymzhan", "Aliakbar", "Manager", 27045.78));
        people.add(new Employee("Adlet", "Baigaliev", "Developer", 50000.00));
        people.add(new Student("Arman", "Erniyaz", 3.5));
        people.add(new Student("Alibi", "Batyrkhan", 2.0));

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}