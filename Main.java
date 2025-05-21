import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to an automatic tierlist!");
        System.out.println("Which list of characters would you like to sort?");
        System.out.println("a. Brawl Stars");

        Scanner scanner = new Scanner(System.in);
        String toSort = scanner.nextLine();

        if (toSort.equalsIgnoreCase("a")) {
            System.out.println("How many characters? (maximum 10)");
            int number = Integer.parseInt(scanner.nextLine());

            if (number > 10 || number < 1) {
                System.out.println("Invalid number! Must be between 1 and 10.");
                return;
            }

            BrawlStars tierList = new BrawlStars(number);
            tierList.display(); 
            tierList.sort();    
            tierList.display();
            if (tierList.isSorted()==true){
                System.out.println("Sorting complete! List is ordered best to worst.");
            }
        } else {
            System.out.println("That option is not supported yet.");
        }

        scanner.close();
    }
}