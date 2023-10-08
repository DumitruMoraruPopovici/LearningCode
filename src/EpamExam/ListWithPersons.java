package EpamExam;

import java.util.List;
import java.util.function.UnaryOperator;

public class ListWithPersons {
    record Person (int id, String name) {}
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person(5, "jack"),
                new Person(7, "john"),
                new Person(3, "kurt"),
                new Person(1, "arnold"));
        UnaryOperator<Integer> consumer = i->i >3 ?i++:i--;;
        for (Person person:persons) {
            System.out.print(consumer.apply(person.id()) + " ");
        }
    }

}
//5 7 3 1 answer
