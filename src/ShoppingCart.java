import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ShoppingCart {
    ArrayList<Item> item;

    String cartName;
    static ShoppingCart cart;
    double totalAmount;
    double payableAmount;
    double discount;
    double tax;

    double cost;
    String coupon;
    String state;
    String[] states = {"IL","CA","NY"};
    List<String> stateList = Arrays.asList(states);


    int shipping;
    ShoppingCart(String name) {
        this.cartName = name;
        this.item = new ArrayList<Item>();
        this.coupon = "";
        this.totalAmount = 0;
        this.payableAmount = 0;
        this.shipping = 0;
        this.tax = 0;
        this.cost = 0;
        this.state = "";
    }

    public int getShipping() {
        return shipping;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setShipping(int shipping) {
        this.shipping = shipping;
    }

    public void addToCart(Item item,int number) {
        for(int i = 0; i < number ; i++){
            this.item.add(item);

        }

    }
    public void showCart() {
        ListIterator<Item> iterator = item.listIterator();
        while(iterator.hasNext()) {
            Item item1 = iterator.next();
            System.out.println(item1);
        }
    }
    public void removeFromCart(Item i) {
        ListIterator<Item> iterator1 = item.listIterator();
        while(iterator1.hasNext()) {
            Item item2 = iterator1.next();
            if (item2.getProductName().equals(i.getProductName())) {
                this.item.remove(i);
                break;
            }
        }
    }
    public double getTotalAmount() {
        ListIterator<Item> iterator2 = item.listIterator();
        this.totalAmount = 0;
        while(iterator2.hasNext()) {
            Item item3 = iterator2.next();
            this.totalAmount = this.totalAmount + (item3.getUnitPrice());
        }
        return this.totalAmount;
    }

    public void getItems() {

        for (int i = 0; i < item.size(); i++)
        {
            System.out.println(item.get(i).getProductName());
        }
    }

    public int getItemsC() {

      return item.size();
    }

    public double getTax() {
        if (( stateList.contains(state))) {
            return 1.06;
        } else {
            return 1.0;
        }
    }


    public double shippingCost(){
        if (this.totalAmount > 50 ){
            return 0;
        }
        else if (shipping == 1)
        {
            return   10.0;
        }
        else if (shipping == 2) {
            return   25.0;
        }
        return 0.0;


    }

    public double getTotalAmountTax()
    {
        return ((this.getTotalAmount()  + this.shippingCost() )* this.getTax());
    }
    public void applyCoupon(String coupon) {
        this.coupon = coupon;
        if (coupon.equals("IND10")) {
            this.discount = this.getTotalAmount() * (0.1);
            this.totalAmount = this.totalAmount - this.discount;
        } else {
            this.totalAmount = this.totalAmount;
        }
    }
    public double getPayableAmount() {
        this.payableAmount = 0;
        this.tax = this.totalAmount * (0.14);
        this.payableAmount = this.totalAmount + tax;
        return this.payableAmount;
    }




    public static ShoppingCart getInstance(String name){
        if (cart == null){
            cart = new ShoppingCart(name);
        }
        return cart;
    }

}
