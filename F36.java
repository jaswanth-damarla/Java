public class F36 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setName("Virat Kohli");//Don't keep '='
        s1.setAge(35);
        s1.setPercentage(75.0);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Marks: " + s1.getPercentage());
    }
}

class Student {
    private String name;
    private int age;
    private double percentage;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPercentage() {
        return percentage;
    }
}
