package Java_assignment;

public class Ticketbooth {
    int visited_list = 0;
    double total_money = 0;
    int Ticket_Count = 0;
    final int price = 250;

    public Ticketbooth() {
        visited_list = visited_list + 1;
    }

    public void counting_people_money() {
        visited_list = visited_list + 1;
        total_money = total_money + price;
        Ticket_Count = Ticket_Count + 1;

    }

    public void display(){
        System.out.println("The total visited people are " + visited_list );
        System.out.println("The total money collected is  " + total_money );
        System.out.println("The total ticket count is  " + Ticket_Count );
    }

    public static void main(String[] args) {
        Ticketbooth t1 = new Ticketbooth();
        t1.counting_people_money();
        t1.display();


    }

}
