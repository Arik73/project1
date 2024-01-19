import java.util.Scanner;

public class Human {
    private final String firstName;
    private final String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(String fullName) {
        String[] names = fullName.split(" ");
        if (names.length > 1) {
            this.firstName = names[0];
            this.lastName = names[1];
        } else {
            this.firstName = fullName;
            this.lastName = "";
        }
    }

    public Human() {
        this.firstName = "";
        this.lastName = "";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void printGreeting() {
        System.out.println("Hello, I am " + getFullName());
    }

    public String toString() {
        return "Human - First Name: " + firstName + ", Last Name: " + lastName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name for Human");
        String firstName = scanner.next();
        System.out.print("Enter last name for Human");
        String lastName = scanner.next();
        Human human = new Human(firstName, lastName);


        System.out.println(human);

        System.out.println("Full name of Human" + human.getFullName());
        human.printGreeting();

        scanner.close();
    }
}
