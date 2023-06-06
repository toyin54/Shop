
import model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Cart cart = new Cart();
    public static String name;
    public static String state;
    public static int shipping;
    static List<Product> itemlist = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    // Initializing the Shopper
    public static Shopper person = new Shopper();
    //Creation of Items
    public static Product product1 = new Product("laptop", 20.0);
    public static Product product2 = new Product("Mop", 5.0);
    public static Product product3 = new Product("TV", 100.0);
    public  static Product product4 = new Product("IPAD", 250.0);
    public static void shop(){
        System.out.println("----------------------");
        System.out.println("Welcome to the  Store");
        itemlist.add(product1);
        itemlist.add(product2);
        itemlist.add(product3);
        itemlist.add(product4);
    }
    public static Product findList(String name){
        for(Product item : itemlist){
            //if (Objects.equals(item.getpName() , name));
            if (name.equals(item.getpName()))
            {
                return item;
            }
        }
        return null;
    }


    public static void personal() {
        System.out.println("What is Your Name");
        name = input.nextLine();
        person.setName(name);
        System.out.println("What is Your State or Residence");
        state = input.nextLine();
        person.setState(state); //Set State
        ;// Input State into cart
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
            userinput = input.nextLine();
            if(userinput.equalsIgnoreCase("A")){
                product1.ItemList();
                product2.ItemList();
                product3.ItemList();
                product4.ItemList();
            }
            //
            if(userinput.equalsIgnoreCase("B")){
                System.out.println("Type in The Product Name");
                String item = input.nextLine();
                System.out.println("How many Items would you like to add");
                int quant = input.nextInt();
                cart.addItems(findList(item),quant);
            }
            if(userinput.equalsIgnoreCase("C")){
                System.out.println("Contents of Shopping cart");  //for loop to iterate through cart?

                cart.getItems();

            }
            if(userinput.equalsIgnoreCase("D")){
                System.out.println("Current total is: " +   cart.totalPrice() + cart.numberofItems());

            }
            if(userinput.equalsIgnoreCase("E")){
                cart.getItems();
                System.out.println("Which item Would You like to remove from Cart\n");

            }





        }while(!userinput.contains("quit"));

        System.out.println("Choose Shipping");
        shipping = input.nextInt();
        person.setShipping(shipping);
        cart.setShipping(shipping);//Set the shipping value

        System.out.println("Transaction completed, your total was after tax is  "+ (cart.totalPricetax() + cart.getTax(state)));

    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        shop();
        personal();
        storefront();





    }
}