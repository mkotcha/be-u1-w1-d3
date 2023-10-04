package PhoneOperator;

public class Call {

    private final PhoneNumber fromNumber;
    private final PhoneNumber destNumber;
    private final int durationSec;

    public Call(PhoneNumber from, PhoneNumber dest, int durationSec) {
        this.fromNumber = from;
        this.destNumber = dest;
        this.durationSec = durationSec;
    }

    public void printCall() {
        System.out.println(this.fromNumber.getNumber() + " -> " + this.destNumber.getNumber() + " - " + (this.durationSec / 60) + ":" + (this.durationSec % 60));
    }
}

