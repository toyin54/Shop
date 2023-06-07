import java.util.HashMap;

public class Item {
    private String productName;
    private int quantity;
    private double unitPrice;

    private HashMap<String, Double> itemlist = new HashMap<String, Double>();



    Item(String productName, double unitPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.itemlist.put(this.productName, this.unitPrice);
    }



    public String toString() {
        String s = this.productName + ":";
        s = s + this.quantity + "\n";
        return s;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void ItemList() {
        for (String i : itemlist.keySet()) {
            System.out.println("Product: " + i + " Price: " + itemlist.get(i));
        }

    }
}
