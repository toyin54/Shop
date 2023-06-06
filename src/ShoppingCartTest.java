import org.junit.Assert.*;

import model.Cart;
import model.Product;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import java.util.*;
import java.io.*;

public class ShoppingCartTest {
    // @Rule
    // public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    // @Test
    // public void correctitemstest(){   //to test that the correct number of items are in our ShoppingCart
    //     Main totest = new Main();
    //     //totest.input = 
    //     String input = "name";
    //     String inputstate = "IL";
    //     String inputcommand = "B";
    //     String inputproduct = "IPAD";
    //     String inputamount  = "4";
    //     String inputcommand2 = "C";
    //     InputStream in = new ByteArrayInputStream(input.getBytes());
    //     System.setIn(in);  //input name
    //     in = new ByteArrayInputStream(inputstate.getBytes());
    //     ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    //     System.setOut(new PrintStream(outContent));
    //     assertEquals("What is Your State or Residence", outContent.toString());
    //     System.setIn(in);  //input state
    //     in = new ByteArrayInputStream(inputcommand.getBytes());
    //     System.setIn(in);  //input "B" to add items
    //     in = new ByteArrayInputStream(inputproduct.getBytes());
    //     System.setIn(in);  //input the product we want (IPAD)
    //     in = new ByteArrayInputStream(inputamount.getBytes());
    //     System.setIn(in);  //input the quant (4)
    //     in = new ByteArrayInputStream(inputcommand2.getBytes());
    //     System.setIn(in);  //input "C" to see contents
    //     //ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    //     //System.setOut(new PrintStream(outContent));
    //     //assertEquals("IPAD", outContent.toString());

    

    // }
    @Test
    public void shouldAddNewProduct() throws Exception {  //Tests to make sure that
                                                            //correct number of items are in cart
        /* add the item to the cart */
        Cart cart = new Cart();
        Product product = new Product("Mop", 5.0);
        cart.addItems(product, 5);

        // when

        // then
        assertEquals(5, cart.numberofItems());

    }
    @Test
    public void shouldTotalPriceBeZeroWhenCartEmpty() throws Exception {
        // when
        Cart cart = new Cart();
        double totalPrice = cart.totalPrice();
        // then
        assertEquals(0, totalPrice,0);
    }

}
