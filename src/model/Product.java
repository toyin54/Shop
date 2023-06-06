package model;

import java.util.HashMap;

public class Product {

        private  String pName;
        private  double price;

        private HashMap<String, Double> itemlist = new HashMap<String, Double>();


    public Product(String pName, double price) {
        this.pName = pName;
        this.price = price;
        this.itemlist.put(this.pName,this.price);
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void ItemList(){
        for (String i : itemlist.keySet()) {
            System.out.println("Product: " + i + " Price: " + itemlist.get(i));
        }
    }
}

