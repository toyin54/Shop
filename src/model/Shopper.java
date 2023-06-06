package model;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class Shopper {
    private String name;
    private String state;
    private int noItems ;

    private int shipping;

    public Shopper(){};

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setShipping(int speed) {
        this.shipping = speed;
    }

    public int getShipping(){
        return shipping;
    }
    public void setNoItems(int noItems) {
        this.noItems = noItems;
    }

    public String getName() {
        return name;
    }

    public int getNoItems() {
        return noItems;
    }

    public String getState() {
        return state;
    }
    public int getTotal(){
        return 0;
    }

//    public Shopper(List<Integer> shipping) {
//        this.shipping = shipping;
//    }


}

