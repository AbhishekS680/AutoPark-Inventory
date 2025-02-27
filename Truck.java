public class Truck {
    // Attributes for Truck
    String make;
    String model;
    int year;
    double price;
    boolean heavyDuty;
    String carries;

    // The constructor that will initialize objects of Truck with the given parameters
    public Truck(String make, String model, int year, double price, boolean heavyDuty, String carries) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.heavyDuty = heavyDuty;
        this.carries = carries;
    }

    // The toString() method allows us to rewrite the string of an object so that it is more readable, and as the necessary information
    public String toString() {
        if (heavyDuty) {
            return "Heavy-duty Truck: " + this.year + " " + this.make + ", " + this.model + ", carries " + this.carries + ", price $" + this.price;
        } else {
            return "Truck: " + this.year + " " + this.make + ", " + this.model + ", carries " + this.carries + ", price $" + this.price;
        }
    }
}