package csc8012;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

    public static void main(String[] args) {

        Client test1 = new Client("Harry","Smith", null,  null);
        Client test2 = new Client("Eleanor","Smith", null,  null);

        Event event1 = new Event("Snowboarding", 4);

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(test1);
        clients.add(test2);
        System.out.println(clients);

        purchaseTickets(test1, event1, 2);

        System.out.println(clients);
        System.out.println(event1);

        Collections.sort(clients);
        System.out.println(clients);

    }

    //method which allows client to buy a number of tickets for a specific event
    public static void purchaseTickets(Client client, Event event, Integer numTickets){
        if (event.buyTicket(numTickets)) {
            client.setEvent(event.getName());
            client.setTickets(numTickets);
        };
    }


    public static void cancelTickets(Client client, Event event, Integer numTickets){

    }

}
