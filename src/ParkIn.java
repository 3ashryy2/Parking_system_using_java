import java.util.Scanner;

public class ParkIn {
    private IParkIn iParkIn;
    public ParkIn(IParkIn iParkIn) {
        this.iParkIn = iParkIn;
    }
   ParkIn () {}
    public boolean findSlot(Vehicle [] vehicles, Slot [] slots, int noOfSlots, Ticket [] tickets, int counter) {
        String modelName, id;
        int modelYear;
        float width, depth;
            Scanner sc = new Scanner(System.in);
                System.out.println("model name");
                modelName = sc.nextLine();
                System.out.println("model year");
                modelYear = sc.nextInt();
                sc.nextLine();
                System.out.println("id");
                id = sc.nextLine();
                System.out.println("width");
                width = sc.nextFloat();
                System.out.println("depth");
                depth = sc.nextFloat();
            
        vehicles[counter]=new Vehicle(id,modelYear,modelName,width,depth);
        tickets[counter] = new Ticket(id);
        return iParkIn.findSlot(vehicles[counter],slots,noOfSlots);
    }
}
