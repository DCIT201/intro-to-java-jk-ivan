import java.util.Scanner; //imports the scanner class from Java's java.util package

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double temperature, convertedTemperature;  //double is used because temperature values often include decimals. temperature will store the temperature value entered by the user and convertedTemperature will store the result of the temperature conversion.

        System.out.println("Welcome to the Temperature Conversion Assistant!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Validate user's choice
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {   //hasnextInt is used to check the input type, preventing errors from wrong entries
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {   // the, || represents logical OR
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next(); // Clear invalid input
            }
        }
        //the above if else statements allows the user to choose between options 1 and 2. anything otherwise that, will return, invalid input, choose between 1 and 2.


        // Prompt for temperature input
        while (true) {
            System.out.print("Enter the temperature value: ");
            if (scanner.hasNextDouble()) {     //hasnextDouble is also used to check the input type, preventing errors from invalid entries
                temperature = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Perform the conversion
        if (choice == 1) {
            // Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("The temperature %.2f°C in Fahrenheit is: %.2f°F%n", temperature, convertedTemperature);
        } else {
            // Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("The temperature %.2f°F in Celsius is: %.2f°C%n", temperature, convertedTemperature);
        }
        

        scanner.close();   // this is to release the resource or close the scanner
        System.out.println("Thank you for using the Temperature Converter!");
    }
}

