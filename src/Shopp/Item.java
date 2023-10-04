package Shopp;

public class Item {
    private final String code;

    private String name;
    private String description;
    private Double price;
    private int stockNumber;

    public Item(String code, String name, String description, Double price) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String detCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
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
