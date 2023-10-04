package Shopp;

public class Cart {

    private final Customer customer;
    Item[] items;

    public Cart(Customer customer) {
        this.customer = customer;
        items = new Item[0];
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public double getTotal() {
        double subTotal = 0.0;
        for (Item item : this.items) {
            subTotal += item.getPrice();

        }
        return subTotal;
    }

    public void addItem(Item item) {

        if (item.getStockNumber() > 0) {
            Item[] newItems = new Item[this.items.length + 1];
            System.arraycopy(this.items, 0, newItems, 0, this.items.length);
            newItems[this.items.length] = item;
            this.items = newItems;
            item.setStockNumber(item.getStockNumber() - 1);
        } else {
            System.out.println(item.getName() + " sold out");
        }
    }
}
