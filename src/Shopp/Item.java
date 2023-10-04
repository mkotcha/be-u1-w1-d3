package Shopp;

public class Item {
    private final String code;
    private String description;
    private Double price;
    private int stockNumber;

    public Item(String code, String description, Double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public String detCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public int getStockNumber() {
        return this.stockNumber;
    }

    public void setStockNumber(int num) {
        this.stockNumber = num;
    }


}
