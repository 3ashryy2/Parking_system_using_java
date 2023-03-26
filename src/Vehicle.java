
import java.util.Scanner;

public class Vehicle {
    
    private String id;
    private int modelYear;
    private String modelName;
    private float width;
    private float depth;


    Vehicle() { 

    }
    Vehicle(String id, int modelYear, String modelName, float width, float depth) {
        this.id = id;
        this.modelYear = modelYear;
        this.modelName = modelName;
        this.width = width;
        this.depth = depth;
    }
    public String getId() {
        return this.id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public int getModelYear() {
        return this.modelYear;
    }


    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModelName() {
        return this.modelName;
    }


    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public float getWidth() {
        return this.width;
    }


    public void setWidth(Float width) {
        this.width = width;
    }

    public float getDepth() {
        return this.depth;
    }

    public void setDepth(Float depth) {
        this.depth = depth;
    }

}