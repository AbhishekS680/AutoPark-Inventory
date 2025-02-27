public class MiniVan {
    // Attributes for MiniVan
    String make;
    String model;
    int year;
    double price;
    boolean covered;
    String carries;

    // The constructor that will initialize objects of MiniVan with the given parameters
    public MiniVan(String make, String model, int year, double price, boolean covered, String carries) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.covered = covered;
        this.carries = carries;
    }

    // The toString() method allows us to rewrite the string of an object so that it is more readable, and as the necessary information
    public String toString() {
        if (covered) {
            return "Covered MiniVan: " + this.year + " " + this.make + ", " + this.model + ", carries " + this.carries + ", price $" + this.price;
        } else {
            return "MiniVan: " + this.year + " " + this.make + ", " + this.model + ", carries " + this.carries + ", price $" + this.price;
        }
    }
}