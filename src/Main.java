

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static ShoppingCart cart = new ShoppingCart("nma");
    public static String name;
    public static Iventory iventory = new Iventory();
    static List<Item> itemlist = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    // Initializing the Shopper
    public static Shopper person = new Shopper();
    //Creation of Items

    static Item i1 = new Item("laptop", 3);
    static Item i2 = new Item("cheese", 2);
    static Item i3 = new Item("bread", 1);
    static Item i4 = new Item("eggs", 50);
    static Item i5 = new Item("Chicken Salami", 2);

    static String  state ;
    static int shipping;

        public static void shops() {
        System.out.println("----------------------");
        System.out.println("Welcome to the  Store");
        Item i1 = new Item("Laptop", 3);
        Item i2 = new Item("cheese", 2);
        Item i3 = new Item("bread", 1);
        Item i4 = new Item("eggs", 50);
        Item i5 = new Item("Chicken Salami", 2);
        iventory.add(i1);iventory.add(i2);iventory.add(i3);iventory.add(i4);iventory.add(i5);
    }
    public static void shop(){
        System.out.println("----------------------");
        System.out.println("Welcome to the  Store");
        itemlist.add(i1);
        itemlist.add(i2);
        itemlist.add(i3);
        itemlist.add(i4);
        itemlist.add(i5);
    }


    public static Item findList(String name){
        for(Item item : itemlist){
            //if (Objects.equals(item.getpName() , name));
            if (name.equals(item.getProductName()))
            {
                return item;
            }
        }
        return null;
    }


    public static void createShopper() {


        System.out.println("What is Your Name");
        name = sc.nextLine();
        person.setName(name);
        System.out.println("What is Your State or Residence");
        state = sc.nextLine();
        cart.setState(state); //Set State
        System.out.println("What is Your Shipping Speed");
        shipping = sc.nextInt();
        cart.setShipping(shipping); //Set State

    }


    public static void storefront(){
        //available user actions
        String userinput;
        System.out.println("Next available user actions");
        String actions = "Type A To Display Items Avaliable For Purchase! \n" +
                "Type B To Add Product to Cart! \n" +
                "Type C to display number of Items in Cart! \n" +
                //"Type D To remove item from cart! \n"+
                "Type D to display your current total \n" +
                "Type E to remove items from your cart \n" +
                "Type quit to when you're ready to finish your transaction! \n"
                ;
        System.out.println(actions);
        do{
            userinput = sc.nextLine();
            if(userinput.equalsIgnoreCase("A")){
                iventory.ItemList();
            }
            //
            if(userinput.equalsIgnoreCase("B")){
                System.out.println("Type in The Product Name");
                String item = sc.nextLine();
                System.out.println("How many Items would you like to add");
                int quant = sc.nextInt();
                cart.addToCart(findList(item),quant);
            }
            if(userinput.equalsIgnoreCase("C")){
                System.out.println("Contents of Shopping cart");  //for loop to iterate through cart?

                cart.showCart();

            }
            if(userinput.equalsIgnoreCase("D")){
                System.out.println("Current total is: " +   cart.getTotalAmount());

            }
            if(userinput.equalsIgnoreCase("E")){
                cart.getItems();
                System.out.println("Which item Would You like to remove from Cart\n");

            }


        }while(!userinput.contains("quit"));



        System.out.println("Transaction completed, your total was after tax is  "+ cart.getTotalAmountTax());

    }
        public static void main(String[] args) {
            // Press Alt+Enter with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            shop();
            shops();
            createShopper();
            storefront();






    }
}