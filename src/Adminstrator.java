import java.util.LinkedList;
public class Adminstrator {
  
    private IParkIn tmp;
    Adminstrator() {}
    public IParkIn setAlgorithm(int choice) {
        if (choice == 1) {
            tmp = new FirstServe();
        }
        else {
            tmp = new BestFit();
        }
        return tmp;

    }
    public double getTotalIncome(Ticket ticket) {
        return ticket.getTotalIncome();
    }

}