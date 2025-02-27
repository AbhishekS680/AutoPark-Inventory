public class SUV {
    // Attributes for SUV
    String make;
    String model;
    String colour;
    int year;
    double price;
    boolean allWheelDrive;

    // The constructor that will initialize objects of SUV with the given parameters
    public SUV(String make, String model, String colour, int year, double price, boolean allWheelDrive) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.price = price;
        this.allWheelDrive = allWheelDrive;
    }

    // The toString() method allows us to rewrite the string of an object so that it is more readable, and as the necessary information
    public String toString() {
        if (allWheelDrive) {
            return "AWD SUV: " + this.year + " " + this.make + ", " + this.model + " (" + this.colour + "), price $" + this.price;
        } else {
            return "SUV: " + this.year + " " + this.make + ", " + this.model + " (" + this.colour + "), price $" + this.price;
        }
    }
}