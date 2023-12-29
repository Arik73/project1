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

        System.out.print("Enter first name for Human 1: ");
        String firstName1 = scanner.next();
        System.out.print("Enter last name for Human 1: ");
        String lastName1 = scanner.next();
        Human human1 = new Human(firstName1, lastName1);

        System.out.print("Enter full name for Human 2: ");
        scanner.nextLine();
        String fullName2 = scanner.nextLine();
        Human human2 = new Human(fullName2);

        Human human3 = new Human();

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        System.out.println("Full name of Human 1: " + human1.getFullName());
        human2.printGreeting();

        scanner.close();
    }
}
