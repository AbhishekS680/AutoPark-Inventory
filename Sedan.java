public class Sedan {
    // Attributes for Sedan
    String make;
    String model;
    String colour;
    int year;
    double price;

    // The constructor that will initialize objects of Sedan with the given parameters
    public Sedan(String make, String model, String colour, int year, double price) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.price = price;
    }

    // The toString() method allows us to rewrite the string of an object so that it is more readable, and as the necessary information
    public String toString() {
        return "Sedan: " + this.year + " " + this.make + ", " + this.model + " (" + this.colour + "), price $" + this.price;
    }
}