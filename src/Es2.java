import PhoneOperator.PhoneNumber;
import PhoneOperator.Sim;

public class Es2 {
    public static void main(String[] args) {
        PhoneNumber myNumber = new PhoneNumber(335, 81245555);
        Sim mySim = new Sim(myNumber);
        mySim.printSimDetail();
        mySim.setCall(new PhoneNumber(335, 12345555), 65);
        mySim.printSimDetail();
    }
}
