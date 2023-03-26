
import java.util.Scanner;

public class Garage {
    int counter = 0;
    private static Garage garage;
    private int noOfSlots;
    private Ticket[] tickets;
    private Slot[] slots;
    private Vehicle[] vehicles;
    private ParkIn parkIn;
    private ParkOut parkOut;
    private Adminstrator admin;

    public void setNoOfSlots(int noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public int getNoOfSlots() {
        return noOfSlots;
    }

    private Garage() {
    }

    public Garage(int noOfSlots) {
        this.noOfSlots = 0;
        this.tickets = new Ticket[noOfSlots];
        this.slots = new Slot[noOfSlots];
        this.vehicles = new Vehicle[noOfSlots];
        this.parkIn = new ParkIn();
        this.parkOut = new ParkOut();
        this.admin = new Adminstrator();
    }

    public void setup(int capacity) {
        noOfSlots = capacity;
        tickets = new Ticket[capacity];
        vehicles = new Vehicle[capacity];
        slots = new Slot[capacity];
        admin = new Adminstrator();
        for (int i = 0; i < capacity; i++) {
            slots[i] = new Slot();
            vehicles[i] = new Vehicle();
            tickets[i] = new Ticket();
        }
    }

    public void setupGarage(int capacity, int choice) {
        if (choice == 1) {
            for (int j = 0; j < capacity; j++) {
                slots[j].setDepth(4);
                slots[j].setWidth(3);
            }
        } else {

                for (int i = 0; i < capacity; i++) {
                    slots[i] = new Slot(i);
                }


        }
        parkIn = new ParkIn(admin.setAlgorithm(choice));
    }

    public boolean ParkingIn(Vehicle[] vehicles, Slot[] slots, int noOfSlots, Ticket[] tickets, int counter) {
        boolean flag = false;
        flag = parkIn.findSlot(vehicles, slots, noOfSlots, tickets, counter);
        counter++;
        if (flag) {
            System.out.println("Vehicle parked");

        } else {
            System.out.println("Vehicle not parked");
        }
        return flag;


    }

    public String ParkingOut(Vehicle[] vehicles, Slot[] slots, int noOfSlots, Ticket[] tickets, String id) {
        parkOut = new ParkOut();
        boolean money = parkOut.findVehicle(vehicles, slots, noOfSlots, tickets, id);
        if (money)
            return "";
        else
            return "Vehicle is not parked";
    }

    public void displayTickets() {
        for (int i = 0; i < noOfSlots; i++) {
            System.out.println(tickets[i].getVehicleId());
        }
    }

    public void printEmptySlots(Slot[] slots, int noOfSlots) {
        for (int i = 0; i < noOfSlots; i++) {
            if (slots[i].getSlot() == true) {
                System.out.println("Slot " + (i + 1) + " is empty");
            }
        }
    }

    public void printTotalIncome(Ticket[] tickets, int noOfSlot) {

        System.out.println("Total income is " + admin.getTotalIncome(tickets[0]));
    }

    public static Garage getGarage() {

        if (garage == null) {
            garage = new Garage();
        }
        return garage;
    }

    public void DoParking() {
        try (Scanner sc = new Scanner(System.in)) {
            int choice = 0;
            System.out.println("1-Client\n2-Admin");
            choice = sc.nextInt();
            while (choice != 1 && choice != 2) {
                System.out.println("Invalid choice");
                System.out.println("1-Client\n2-Admin");
                choice = sc.nextInt();
                sc.nextLine();
            }
            boolean on = true;
            while (on) {
                if (choice == 1) {
                    System.out.println("Enter 1 to park vehicle");
                    System.out.println("Enter 2 to unpark vehicle");
                    System.out.println("Enter 3 to exit");
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1:
                            ParkingIn(vehicles, slots, noOfSlots, tickets, counter);
                            break;
                        case 2:
                            System.out.println("Enter the vehicle id");
                            sc.nextLine();
                            String id1 = sc.nextLine();
                            System.out.println(ParkingOut(vehicles, slots, noOfSlots, tickets, id1));
                            break;
                        case 3:
                            on = false;
                            System.exit(0);
                            break;
                        case 4:
                            displayTickets();
                            break;
                    }

                }
                if (choice == 2) {
                    System.out.println("Enter 1 to print empty slots");
                    System.out.println("Enter 2 to print total income");
                    System.out.println("Enter 3 to exit");
                    int choice2;
                    choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            printEmptySlots(slots, noOfSlots);
                            break;
                        case 2:
                            printTotalIncome(tickets, noOfSlots);
                            break;
                        case 3:
                            System.exit(0);
                            break;
                    }

                }
            }
        }
    }


}