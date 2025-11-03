
package pizzabillingsystem;

import java.util.Scanner;

public class Pizzabillingsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basePrice = 0;
        int finalBill = 0;

        
        while (true) {
            System.out.print("Enter pizza size (small, medium, large): ");
            String size = scanner.nextLine().toLowerCase();

            if (size.equals("small")) {
                basePrice = 100;
                finalBill += basePrice;
                break;
            } else if (size.equals("medium")) {
                basePrice = 200;
                finalBill += basePrice;
                break;
            } else if (size.equals("large")) {
                basePrice = 300;
                finalBill += basePrice;
                break;
            } else {
                System.out.println("Invalid! Try again.");
                continue;
            }
        }

       
        System.out.print("Do you want pepperoni? (yes/no): ");
        String pepperoni = scanner.nextLine().toLowerCase();
        if (pepperoni.equals("yes")) {
            if (basePrice == 100) {
                finalBill += 30;
            } else {
                finalBill += 50;
            }
        }

      
        System.out.print("Do you want extra cheese? (yes/no): ");
        String cheese = scanner.nextLine().toLowerCase();
        if (cheese.equals("yes")) {
            finalBill += 20;
        }

       
        System.out.println("Your final bill is: " + finalBill + " rupee");
    }
}