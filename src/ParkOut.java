import java.util.Objects;

public class ParkOut {

    ParkOut() {}
    public boolean findVehicle(Vehicle[] vehicle, Slot [] slots, int noOfSlots,Ticket [] tickets, String id) {
        for (int i = 0; i < noOfSlots; i++) {
            if (Objects.equals(id, tickets[i].getVehicleId())) {
                for(int j = 0; j < noOfSlots; j++) {
                    if(vehicle[i].getId() == slots[j].getVehicleId()) {
                        slots[j].setSlot(true);
                        slots[j].setVehicleId("");
                        System.out.println("Total money is " + tickets[j].setDepartureTime());
                        return true;
                    }
                }
     
            }
        }
        return false;
    }
}