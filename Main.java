import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        
        
        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }
        
        System.out.print("\nEnter the name you want to search for: ");
        String searchName = sc.nextLine();
        

        names.forEach(name -> {
            if (name.equalsIgnoreCase(searchName)) {
                System.out.println("Eureka");
            }
        });
        
        sc.close();
    }
}