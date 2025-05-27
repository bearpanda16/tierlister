import java.util.Scanner;

public class Main { //soirts
    public static void main(String[] args) {
        System.out.println("Hello, welcome to an automatic tierlist!");
        System.out.println("Which list of characters would you like to sort?");
        System.out.println("a. Brawl Stars Characters");
        System.out.println("b. Movies");
        System.out.println("c. Video Games");
        System.out.println("d. Sports");
        
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
        } 



        else if (toSort.equalsIgnoreCase("b")) {
            System.out.println("How many movies? (maximum 10)");
            int number = Integer.parseInt(scanner.nextLine());

            if (number > 10 || number < 1) {
                System.out.println("Invalid number! Must be between 1 and 10.");
                return;
            }

            Movies tierList = new Movies(number);
            tierList.display(); 
            tierList.sort();    
            tierList.display();
            if (tierList.isSorted()==true){
                System.out.println("Sorting complete! List is ordered best to worst.");
            }
        } 
        
        else if (toSort.equalsIgnoreCase("c")) {
            System.out.println("How many games? (maximum 10)");
            int number = Integer.parseInt(scanner.nextLine());

            if (number > 10 || number < 1) {
                System.out.println("Invalid number! Must be between 1 and 10.");
                return;
            }

            VideoGames tierList = new VideoGames(number);
            tierList.display(); 
            tierList.sort();    
            tierList.display();
            if (tierList.isSorted()==true){
                System.out.println("Sorting complete! List is ordered best to worst.");
            }
        } 

        else if (toSort.equalsIgnoreCase("d")) {
            System.out.println("How many sports? (maximum 10)");
            int number = Integer.parseInt(scanner.nextLine());

            if (number > 10 || number < 1) {
                System.out.println("Invalid number! Must be between 1 and 10.");
                return;
            }

            Sports tierList = new Sports(number);
            tierList.display(); 
            tierList.sort();    
            tierList.display();
            if (tierList.isSorted()==true){
                System.out.println("Sorting complete! List is ordered best to worst.");
            }
        } 
        else {
            System.out.println("That option is not supported yet.");
        }

        scanner.close();
    }
}