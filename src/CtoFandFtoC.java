import java.util.Scanner;

public class CtoFandFtoC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temp;
        char ForC; // For user to pick F or C
        char again; // Do run program again with another temperature

        do {
            // Validate type of temperature
            do {
                System.out.println("Please enter the temperature type (F or C):");
                ForC = Character.toUpperCase(in.next().charAt(0));
            } while (ForC != 'F' && ForC != 'C');

            // Validate input for temp
            do {
                System.out.println("Please enter the temperature value:");
                while (!in.hasNextDouble()) {
                    System.out.println("This temperature is invalid! Please enter a valid number:");
                    in.next();
                }
                temp = in.nextDouble();
            } while (temp < -273.15); // Absolute zero in Celsius

            // Convert temperature based on F or C
            if (ForC == 'F') {
                temp = (temp - 32) * 5 / 9;
                System.out.println("The temperature in Celsius is: " + temp + " C");
            } else {
                temp = (temp * 9 / 5) + 32;
                System.out.println("The temperature in Fahrenheit is: " + temp + " F");
            }

            // Ask user if they want to convert another temperature
            System.out.println("Do you want to convert another temperature? (Y/N)");
            again = Character.toUpperCase(in.next().charAt(0));
        } while (again == 'Y');

        in.close();
    }

    }
