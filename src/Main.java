
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int noOfSlots, choice;
        Garage garage;
        garage = Garage.getGarage();
        System.out.println("Enter number of slots: ");
        Scanner sc = new Scanner(System.in);
        noOfSlots = sc.nextInt();
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Invalid choice");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        }
        sc.nextLine();
        garage=new Garage(noOfSlots);
        garage.setup(noOfSlots);
        garage.setupGarage(noOfSlots, choice);
        garage.DoParking();


    }
}
