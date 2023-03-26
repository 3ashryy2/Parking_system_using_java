import java.util.Scanner;

public class Slot {
    private float width;
    private float depth;
    private boolean isEmpty;
    private String vehicleId;

    Slot(){
        isEmpty = true;
        depth = 0;
        width = 0;

    }
    public Slot(Slot slot) {
        this.depth = slot.depth;
        this.isEmpty = slot.isEmpty;
        this.width = slot.width;
    }
    public Slot(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter " + (i + 1) + " slot info");
        System.out.println("Enter width");
        width = sc.nextFloat();
        System.out.println("Enter depth");
        depth = sc.nextFloat();
    }
    public boolean isEmpty() {
        return isEmpty;
    }

    public float getDepth() {
        return this.depth;
    }


    public void setDepth(float depth) {
        this.depth = depth;
    }

    
    public float getWidth() {
        return this.width;
    }


    public void setWidth(float width) {
        this.width = width;
    }

    public void setSlot(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public boolean getSlot() {
        return isEmpty;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehicleId () {
        return vehicleId;
    }

}