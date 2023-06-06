//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Driver {
//    static Scanner sc;                    // 	to scan user input initialized in main function.
//
//    Shopper person;
//
//    static ShoppingCart cart;
//
//    static Iventory iventory;
//
//    Driver(String cartName) {
//        sc = new Scanner(System.in);
//        cart = ShoppingCart.getInstance(cartName);
//    }
//
//    public void shop() {
//        System.out.println("----------------------");
//        System.out.println("Welcome to the  Store");
//        Item i1 = new Item("Laptop", 3);
//        Item i2 = new Item("Cheese Slices", 2);
//        Item i3 = new Item("Bread", 1);
//        Item i4 = new Item("Eggs", 50);
//        Item i5 = new Item("Chicken Salami", 2);
//        iventory.add(i1);iventory.add(i2);iventory.add(i3);iventory.add(i4);iventory.add(i5);
//    }
//
//    void createShopper() {
//
//        String name , state , shipping;
//        System.out.println("What is Your Name");
//         name = sc.nextLine();
//        person.setName(name);
//        System.out.println("What is Your State or Residence");
//        state = sc.nextLine();
//        cart.setState(state); //Set State
//        System.out.println("What is Your Shipping Speed");
//        shipping = sc.nextLine();
//        cart.setState(shipping); //Set State
//
//    }
//
//    public static void storefront(){
//        //available user actions
//        String userinput;
//        System.out.println("Next available user actions");
//        String actions = "Type A To Display Items Avaliable For Purchase! \n" +
//                "Type B To Add Product to Cart! \n" +
//                "Type C to display number of Items in Cart! \n" +
//                "Type D To remove item from cart! ";
//        System.out.println(actions);
//        do{
//            userinput = sc.nextLine();
//            if(userinput.equals("A")){
//                iventory.ItemList();
//
//
//
//            }
//            //
//            if(userinput.equalsIgnoreCase("B")){
//                System.out.println("Type in The Product Name");
//                String item = sc.nextLine();
//                System.out.println("How many Items would you like to add");
//                int quant = sc.nextInt();
//                cart.addToCart(Iventory.findList(item),quant);
//            }
//            if(userinput.equalsIgnoreCase("C")){
//                System.out.println("Contents of Shopping cart");  //for loop to iterate through cart?
//
//                cart.getItems();
//
//            }
//            if(userinput.equalsIgnoreCase("D")){
//                System.out.println("Current total is: " +   cart.getTotalAmount() );
//
//            }
//            if(userinput.equalsIgnoreCase("E")){
//                cart.getItems();
//                System.out.println("Which item Would You like to remove from Cart\n");
//
//            }
//
//
//
//        }while(!userinput.contains("quit"));
//
//
//        System.out.println("Transaction completed, your total was after tax is  "+ cart.getTotalAmount() );
//
//    }
//}
