public class Dog {
    // Instance variables
    String name;
    String color;

    // Parameterized constructor
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Method to print the values
    public void displayInfo() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Color: " + color);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of Dog (corrected)
        Dog myDog = new Dog("Bruno", "Brown");

        // Displaying the information
        myDog.displayInfo();
    }
}

/*
OUTPUT
Dog Name: Bruno
Dog Color: Brown */