public class AutoPark {
    // Attributes for Autopark
    String name; // Holds the name for the Auto Park Inventory
    Sedan sedan1, sedan2;
    SUV SUV1, SUV2;
    Truck truck1, truck2;
    MiniVan minivan1, minivan2;
    Tire tire1, tire2;

    public AutoPark (String name) {
        this.name = name;
        // Sedan Objects
        sedan1 = new Sedan("Honda", "Civic", "Blue", 2014, 24000.0);
        sedan2 = new Sedan("Tesla", "Model 3", "White", 2019, 68000.0);
        // SUV Objects
        SUV1 = new SUV("Hyundai", "Santa Fe", "Brown", 2024, 70000.0, true);
        SUV2 = new SUV("Nissan", "Rogue", "Red", 2015, 19000.0, false);
        // Truck Objects
        truck1 = new Truck("Ford", "F-150", 2020, 40000.0, true, "goods");
        truck2 = new Truck("Tesla", "Cybertruck", 2023, 120000.0, false, "equipment");
        // Minivan Objects
        minivan1 = new MiniVan("Dodge", "Caravan", 2006, 5000.0, false, "equipment");
        minivan2 = new MiniVan("Honda", "Odyssey", 2012, 11000.0, true, "goods");
        // Tire Objects
        tire1 = new Tire(30, 78, 250.0, true);
        tire2 = new Tire(50, 92, 450.0, false);

    }

    public void displayItems() {
        // This will print out all the string representations of the objects that we have created. They will all hold valuable information since we edited them with the toString method
        System.out.println("The " + name + " inventory includes:\n");
        System.out.println(sedan1);
        System.out.println(sedan2);
        System.out.println(SUV1);
        System.out.println(SUV2);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(minivan1);
        System.out.println(minivan2);
        System.out.println(tire1);
        System.out.println(tire2);

    }

    /**This method should return a boolean (true or false) based on if the input the user gave is included in one of the objects that we have created
     * @param userInput - a string that carries the user's input
     * @return boolean: will return true if the user's input is included in one of the products in the inventory. If not, it will return false.
     */
    public boolean searchItem(String userInput) {
        userInput = userInput.toLowerCase();

        Object[] automobiles = {sedan1, sedan2, SUV1, SUV2, truck1, truck2, minivan1, minivan2, tire1, tire2}; // Objects are put in an array so that we can iterate over objects

        for (int i=0; i < automobiles.length; i++) {
            String objectStr = automobiles[i].toString().toLowerCase();

            if (objectStr.contains(userInput)) {
                return true;
            }
        }
        return false;
    }
}
