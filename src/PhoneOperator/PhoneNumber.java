package PhoneOperator;

public class PhoneNumber {
    private final int prefix;
    private final int num;

    public PhoneNumber(int prefix, int num) {
        this.prefix = prefix;
        this.num = num;
    }

    public void printNumber() {
        System.out.println(this.prefix + "/" + this.num);
    }

    public String getNumber() {
        return this.prefix + "/" + this.num;
    }
}
