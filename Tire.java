public class Tire {
    // Attributes for Tire
    int wheelDiameter;
    int sectionWidth;
    double price;
    boolean passengerTire;

    // The constructor that will initialize objects of Tire with the given parameters
    public Tire(int wheelDiameter, int sectionWidth, double price, boolean passengerTire) {
        this.wheelDiameter = wheelDiameter;
        this.sectionWidth = sectionWidth;
        this.price = price;
        this.passengerTire = passengerTire;
    }

    // The toString() method allows us to rewrite the string of an object so that it is more readable, and as the necessary information
    public String toString() {
        if (passengerTire) {
            return "Passenger tire with " + this.wheelDiameter + "\"\" wheel diameter, " + this.sectionWidth + " mm. section width, price $" + this.price;
        } else {
            return "Front tire with " + this.wheelDiameter + "\"\" wheel diameter, " + this.sectionWidth + " mm. section width, price $" + this.price;
        }
    }
}
