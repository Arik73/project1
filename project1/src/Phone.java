import java.util.Scanner;

public class Phone {
    private final String number;
    private final String model;
    private final double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public boolean equalsIgnoreCase(String otherNumber) {
        return this.number.equalsIgnoreCase(otherNumber);
    }

    public String toString() {
        return "Phone - Number: " + number + ", Model: " + model + ", Weight: " + weight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone number for Phone 1: ");
        String number1 = scanner.next();
        System.out.print("Enter model for Phone 1: ");
        String model1 = scanner.next();
        System.out.print("Enter weight for Phone 1: ");
        double weight1 = scanner.nextDouble();
        Phone phone1 = new Phone(number1, model1, weight1);

        System.out.print("Enter phone number for Phone 2: ");
        String number2 = scanner.next();
        System.out.print("Enter model for Phone 2: ");
        String model2 = scanner.next();
        Phone phone2 = new Phone(number2, model2);

        System.out.print("Enter phone number for Phone 3: ");
        String number3 = scanner.next();
        System.out.print("Enter model for Phone 3: ");
        String model3 = scanner.next();
        System.out.print("Enter weight for Phone 3: ");
        double weight3 = scanner.nextDouble();
        Phone phone3 = new Phone(number3, model3, weight3);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

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
