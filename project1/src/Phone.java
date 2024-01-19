import java.util.Scanner;

public class Phone {
    private final String number;
    private final String model;
    private final double weight;

    private static int instanceCount;

    static {
        instanceCount = 0;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        instanceCount++;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
        instanceCount++;
    }
    public boolean equalsIgnoreCase(String otherNumber) {
        return this.number.equalsIgnoreCase(otherNumber);
    }

    public String toString() {
        return "Phone - Number: " + number + ", Model: " + model + ", Weight: " + weight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone number for Phone");
        String number1 = scanner.next();
        System.out.print("Enter model for Phone");
        String model1 = scanner.next();
        System.out.print("Enter weight for Phone");
        double weight1 = scanner.nextDouble();
        Phone phone1 = new Phone(number1, model1, weight1);

        double minResult = Math.min(10, 5);
        System.out.println("Result of Math.min(10, 5): " + minResult);

        System.out.println("Total instances created: " + instanceCount);

        System.out.println(phone1);

        System.out.println("Total instances created: " + instanceCount);

        System.out.print("Enter a phone number to compare with Phone 1: ");
        String compareNumber = scanner.next();
        if (phone1.equalsIgnoreCase(compareNumber)) {
            System.out.println("The entered phone number is equal to Phone 1 (case-insensitive).");
        } else {
            System.out.println("The entered phone number is not equal to Phone 1 (case-insensitive).");
        }

        scanner.close();
    }
}
