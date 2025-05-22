import java.util.Scanner;

public class Sports {
    private int numberOfGames;
    private boolean sorted = false;
    private String[] sports = { "Basketball", "Badminton", "Swimming", "Soccer", "Football", "Lacrosse", "Track and Field", "Volleyball", "Tennis",
            "Baseball" };
    private String[] toSort;
    private Scanner Scanner = new Scanner(System.in);

    Sports(int n) {
        numberOfGames = n;
        toSort = new String[n];
        int count = 0;

        while (count < n) {
            int index = (int) (Math.random() * sports.length);
            String candidate = sports[index];

            if (!contains(toSort, candidate, count)) {
                toSort[count] = candidate;
                count++;
            }
        }
    }
     private boolean contains(String[] array, String value, int upTo) {
        for (int i = 0; i < upTo; i++) {
            if (array[i] != null && array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void compare(int i, int j) {
        System.out.println("Who is better?");
        System.out.println("1: " + toSort[i]);
        System.out.println("2: " + toSort[j]);
        System.out.print("Enter 1 or 2: ");

        int choice = Scanner.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.print("Invalid input. Enter 1 or 2: ");
            choice = Scanner.nextInt();
        }

        if (choice == 2) {
            String temp = toSort[i];
            toSort[i] = toSort[j];
            toSort[j] = temp;
        }
    }

    public void sort() { //uses bubble sort
        for (int i = 0; i < toSort.length - 1; i++) {
            for (int j = 0; j < toSort.length - i - 1; j++) {
                compare(j, j + 1); //calls helper method
            }
        }
        sorted = true;
    }

    public boolean isSorted() {
        return sorted;
    }

    public void display() {
        System.out.println("Current Sport Order:");
        for (String b : toSort) {
            System.out.print(b + ", ");
        }
        System.out.println();
    }
}
