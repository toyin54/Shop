public class Shopper {
    private String name;
    private String state;
    private int noItems ;

    private int shipping;

    public Shopper(){};

    public void setName(String name) {
        this.name = name;
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

}
