public class BestFit implements IParkIn {

private boolean flag = false;
BestFit() {}
    public boolean findSlot(Vehicle vehicle, Slot [] slots, int noOfSlots) {
        for (int i = 0; i < noOfSlots; i++) {
            if(slots[i].getWidth()<= vehicle.getWidth() && slots[i].getDepth()<= vehicle.getDepth()) {
                slots[i].setVehicleId(vehicle.getId());
                slots[i].setSlot(false);
                flag = true;
                break;
            }
        }
        if (!flag)
            return false;
        else
            return true;

    }

}