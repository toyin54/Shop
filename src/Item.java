import java.util.HashMap;

public class Item {
    private String productName;

    private double unitPrice;

    private HashMap<String, Double> itemlist = new HashMap<String, Double>();



    Item(String productName, double unitPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.itemlist.put(this.productName, this.unitPrice);
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


    public double getUnitPrice() {
        return this.unitPrice;
    }


}
