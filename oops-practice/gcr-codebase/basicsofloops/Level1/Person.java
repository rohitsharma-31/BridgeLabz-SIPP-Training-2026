public class Person {
    private String name;
    private int age;

    public Person() {
        this("Unknown", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this(other.name, other.age);
    }

    public void displayDetails() {
        System.out.println("Person: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Rahul", 21);
        Person person2 = new Person(person1);
        person1.displayDetails();
        person2.displayDetails();
    }
}
