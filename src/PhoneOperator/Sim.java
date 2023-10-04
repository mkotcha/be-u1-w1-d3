package PhoneOperator;

public class Sim {
    private final PhoneNumber number;
    private Call[] callList;

    private Double credit;

    public Sim(PhoneNumber num) {
        this.number = num;
        this.callList = new Call[5];
        this.credit = 0.0;
    }

    public void setCall(PhoneNumber num, int durationSec) {
        Call lastCall = new Call(this.number, num, durationSec);
        Call[] newList = new Call[callList.length];

        for (int i = 0; i < callList.length; i++) {
            if (i == 0) newList[i] = lastCall;
            else newList[i] = this.callList[i - 1];
        }
        this.callList = newList;

        credit -= 0.20;
    }

    public void printSimDetail() {
        System.out.println("numero: " + this.number.getNumber());
        System.out.println("credito: " + this.credit);
        System.out.println("ultime chiamate");
        for (Call call : callList) {
            if (call != null) call.printCall();
        }
    }
}
