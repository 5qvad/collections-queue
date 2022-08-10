public class Person {

    private String name;
    private String surname;
    private int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public void useTicket() {
        tickets--;
        System.out.println(name + " " + surname + " прокатнулся на атракционе! осталось билетов: " + tickets );
    }

    public int getTickets(){
        return tickets;
    }
}
