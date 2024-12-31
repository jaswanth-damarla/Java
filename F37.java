// Main class
public class F37 {
    public static void main(String args[]) {
        Dog d = new Dog();
        System.out.println(d.getBark()); // Prints "Bow Bow"
        d.getAction();                  // Prints "Each one having unique one"
    }
}

// Animal class
class Animal {
    // Protected method can be accessed in the subclass
    protected void Action() {
        System.out.println("Each one having unique one");
    }

    // Public method to invoke Action
    public void getAction() {
        Action(); // Call the Action method
    }
}

// Dog class inheriting Animal
class Dog extends Animal {
    private String b = "Bow Bow"; // Instance variable

    // Public method to get bark sound
    public String getBark() {
        return b;
    }
}
