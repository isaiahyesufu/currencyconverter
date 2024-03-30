import java.util.Scanner;


public class currencyConverter {

    public static void main(String[] args) {
        System.out.println("1 Naira");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        // convert the amount
        switch (choice) {
            case 1:
                Naira_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    public static void Naira_to_other(double amt) {
        double nairaToDollarRate = 0.0023; 
        double nairaToEuroRate = 0.0022; 
        System.out.println("1 Naira = " + nairaToDollarRate + " Dollar");
        System.out.println();

        System.out.println(amt + " Naira = " + (amt * nairaToDollarRate) + " Dollar");
        System.out.println();

        System.out.println("1 Naira = " + nairaToEuroRate + " Euro");
        System.out.println();
        System.out.println(amt + " Naira = " + (amt * nairaToEuroRate) + " Euro");
        System.out.println();

    }

    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 445.54 + " Naira"); 
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 445.54) + " Naira");
        System.out.println();

        
    }

    public static void Euro_to_other(double amt) {
        System.out.println("1 Euro = " + 460.27 + " Naira"); // Updated conversion rate
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 460.27) + " Naira");
        System.out.println();

        
    }
}