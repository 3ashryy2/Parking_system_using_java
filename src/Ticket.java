import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;
public class Ticket {

    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private String vehicleId;
    private Payment payment;
    Ticket(){
        payment = new Payment();
    }
    Ticket(String Id) {
        arrivalTime = LocalDateTime.now();
        departureTime = null;
        vehicleId = Id;
        payment = new Payment();
    }


    public Ticket(Ticket ticket) {
        this.arrivalTime = ticket.arrivalTime;
        this.departureTime = ticket.departureTime;
        this.vehicleId = ticket.vehicleId;
    }
   
    public LocalDateTime getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime() {
        this.arrivalTime = LocalDateTime.now();
    }

    public LocalDateTime getDepartureTime() {
        return this.departureTime;
    }


    public double setDepartureTime() {
        this.departureTime = LocalDateTime.now();
        long hours = ChronoUnit.HOURS.between(departureTime,arrivalTime);
        payment.setNoOfHours(((hours) / (60 * 60 * 1000)) + 1);
        return payment.getTotalPrice();
    }

    public String getVehicleId() {
        return this.vehicleId;
    }


    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public double getTotalIncome() {
       return payment.getTotalIncome();
    }
    

}