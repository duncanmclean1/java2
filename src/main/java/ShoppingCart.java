import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> list;
    private double total;
    private double shipping;

    public ShoppingCart() {
        this.total = 0.0;
        this.list = new ArrayList<Item>();
        this.shipping = 5.00;
    }

    public void addItem(Item i) {
        list.add(i);
    }

    public double getTotal() {
        return this.total;
    }

    public void calculateTotal() {
        for (int i = 0; i < this.list.size(); i++) {
            this.total += list.get(i).getPrice() * list.get(i).getQuantity();
        }

        if (this.total < 10)
            total += 10;

        total += (total * 0.1);
    }

    public Invoice shipOrder(String n, String a, String c, String s, int z) {
        Invoice in = new Invoice(n, a, c, s, z);
        return in;
    }

}
