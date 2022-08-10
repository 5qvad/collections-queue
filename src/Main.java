import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    static List<Person> generateClients() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Alex", "Davidov", 8));
        list.add(new Person("Petya", "Sobolev", 5));
        list.add(new Person("Tanya", "Morozova", 12));
        list.add(new Person("Misha", "Shufik", 4));
        list.add(new Person("Genrikh", "Junior", 10));
        return list;
    }

    public static void main(String[] args) {
        Person person;
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            person = queue.poll();
            person.useTicket();
            if (person.getTickets() != 0) {
                queue.offer(person);
            }
        }
    }
}

