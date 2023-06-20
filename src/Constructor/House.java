package Constructor;

public class House {

    //Create a class called House that has 3 instance variables:
    //a string address
    //an int numberOfFloors
    //Define a constructor method for House that will print in console a message as soon as a House object is created

    private String address;
    private int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("House object was created.");
        System.out.println("Address: " + address + ". This house has " + numberOfFloors + " floors.");
        System.out.println(" ");
    }
}
