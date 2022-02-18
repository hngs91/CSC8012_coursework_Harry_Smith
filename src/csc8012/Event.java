package csc8012;

public class Event implements Comparable<Event>{

    private String name;
    private int ticket;

    //constructor
    public Event(String name, int ticket){
        this.name = name;
        this.ticket = ticket;
    }


    //getter methods
    public String getName() {
        return name;
    }

    public int getTicket() {
        return ticket;
    }

    //setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    //method to buy a ticket
    public boolean buyTicket(int ticket){
        if (this.ticket > ticket) {
            this.ticket = this.ticket - ticket;
        }return true;
    }

    //method to cancel a ticket
    public void cancelTicket(int ticket) {
        this.ticket = this.ticket + ticket;
    }

    @Override
    public int compareTo(Event e){
        int nCmp = name.compareTo(e.name);
        return nCmp;
    }

    @Override
    public String toString(){
        return "Event: " + name + "\nTickets: " + ticket;
    }

}
