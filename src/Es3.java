import Shopp.Cart;
import Shopp.Customer;
import Shopp.Item;

public class Es3 {
    public static void main(String[] args) {
        Customer me = new Customer("A0001", "Mario Rossi", "mario@rossi.it");
        Item banana = new Item("I001", "ciquita", "molto gialla e poco buona", 0.5);
        Item caffe = new Item("I002", "saquella", "molto scuro e poco buono", 1.5);
        Cart cart = new Cart(me);
        banana.setStockNumber(3);
        caffe.setStockNumber(5);
        cart.addItem(banana);
        cart.addItem(caffe);
        System.out.println("totale carrello: " + cart.getTotal());
        Item mela = new Item("I003", "melinda", "molto rossa buona", 0.2);
        cart.addItem(mela);
    }
}
