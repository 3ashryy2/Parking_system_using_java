import java.time.LocalDateTime;

public class Payment {

    private long noOfHours;
    private int ratePerHour = 5;
    private static double totalIncome = 0;
   

    Payment() {}
    public long getNoOfHours() {
        return this.noOfHours;
    }


    public void setNoOfHours(long noOfHours) {
        this.noOfHours = noOfHours;
    }

    public long getRatePerHour() {
        return this.ratePerHour;
    }


    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double getTotalPrice() {
        totalIncome += (ratePerHour * noOfHours);
        return ratePerHour * noOfHours;
    }
    public double getTotalIncome() {
        return totalIncome;
    }

}