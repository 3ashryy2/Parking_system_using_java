public class FirstServe implements IParkIn {
boolean flag = false;
FirstServe() {}
    public boolean findSlot(Vehicle vehicle, Slot [] slots, int noOfSlots) {
        for (int i = 0;i < noOfSlots;i++) {
            if (slots[i].getSlot()) {
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