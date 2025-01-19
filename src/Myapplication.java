import java.util.*;
import java.util.Collections;

public class Myapplication {
    public static void main(String[] args) {
        ArrayList<Person> payables = new ArrayList<>();

        payables.add(new Employee("John", "Lennon", "Manager", 27045.78));
        payables.add(new Employee("George", "Harrison", "Developer", 50000.00));
        payables.add(new Student("Ringo", "Starr", 2.5));
        payables.add(new Student("Paul", "McCartney", 3.2));

        Collections.sort(payables);
        printData(payables);
    }

    public static void printData(ArrayList<Person> payables) {
        for (Payable p : payables) {
            System.out.println(p + " earns " + p.getPaymentAmount() + " tenge");
        }
    }

}1