public class F40 {
    // Static variable shared by all instances
    static int size = 0;

    // Constructor
    public F40() {
        size++; // Increment size whenever a new object is created
    }

    // Static method to get the size
    public static int getSize() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        F40 c1 = new F40();
        F40 c2 = new F40();
        F40 c3 = new F40();

        // Access the static variable using the class name
        System.out.println("Number of Counter objects created: " + F40.getSize());
    }
}