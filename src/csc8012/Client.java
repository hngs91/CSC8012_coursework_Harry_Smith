package csc8012;

public class Client implements Comparable<Client>{

    private String firstName;
    private String lastName;
    private String event;
    private Integer numTickets;

    //getter methods
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEvent(){
        return event;
    }

    public Integer getNumTickets(){
        return numTickets;
    }

    //setter methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEvent(String event){
        this.event = event;
    }

    public void setTickets(Integer numTickets){
        this.numTickets = numTickets;
    }

    //Constructor
    public Client(String firstName, String lastName, String event, Integer numTickets ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.event = event;
        this.numTickets = numTickets;
    }

    //method allows client to cancel tickets they already own

    @Override
    public int compareTo(Client c){
        int lnCmp = lastName.compareTo(c.lastName);
        int fnCmp = firstName.compareTo(c.firstName);

        if (lnCmp !=0) return lnCmp;
        else return fnCmp;
    }

    @Override
    public String toString(){
        return "Client: " + firstName + " " + lastName + ", " + "Event: " + event + ", " + "Tickets: " + numTickets;
    }
}
