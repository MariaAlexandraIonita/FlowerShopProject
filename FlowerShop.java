import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            displayMenu();
            choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    orderDetailsAndPriceCalculation(scanner);
                    break;
                case 2:
                    summaryStatistics();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Flower shop menu");
        System.out.println("1. Order bouquet and get the price.");
        System.out.println("2. Display statistics");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static int getUserChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            scanner.next();
            displayMenu();
        }
        return scanner.nextInt();
    }

    public static void orderDetailsAndPriceCalculation(Scanner scanner) {
        String[] flowers = {"Rose", "Lily", "Carnations", "Daffodil", "Gerbera", "Chrysanthemum", "Assorted"};
        String[] colors = {"White", "Red", "Pink", "Yellow", "Blue", "Assorted"};
        String[] sizes = {"Small", "Medium", "Large"};
        double[] prices = {10.0, 15.0, 20.0}; 
        
        System.out.println("Enter flower type (1-Rose, 2-Lily, 3-Carnations, 4-Daffodil, 5-Gerbera, 6-Chrysanthemum, 7-Assorted): ");
        int flowerChoice = scanner.nextInt();
        if (flowerChoice < 1 || flowerChoice > 7) {
            System.out.println("Invalid flower choice.");
            return;
        }

        System.out.println("Enter color type (1-White, 2-Red, 3-Pink, 4-Yellow, 5-Blue, 6-Assorted): ");
        int colorChoice = scanner.nextInt();
        if (colorChoice < 1 || colorChoice > 6) {
            System.out.println("Invalid color choice.");
            return;
        }

        System.out.println("Enter size type (1-Small, 2-Medium, 3-Large): ");
        int sizeChoice = scanner.nextInt();
        if (sizeChoice < 1 || sizeChoice > 3) {
            System.out.println("Invalid size choice.");
            return;
        }

        double price = prices[sizeChoice - 1] + 2.25; 
        System.out.println("The price of the bouquet is: " + price);
        System.out.println("Ordered: " + sizes[sizeChoice - 1] + " " + flowers[flowerChoice - 1] + " (" + colors[colorChoice - 1] + ")");
    }

    public static void summaryStatistics() {
        System.out.println("Summary statistics provided.");
    }
}
