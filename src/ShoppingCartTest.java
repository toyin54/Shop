import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {
    Item i1 = new Item("Olive Oil 1l", 3);
    Item i2 = new Item("Cheese Slices", 2);
    Item i3 = new Item("Bread", 1);
    Item i4 = new Item("Eggs", 50);
    Item i5 = new Item("Chicken Salami", 2);


    Shopper jose = new Shopper();
    ShoppingCart cart = new ShoppingCart("name");



    @Test
    public void testGetItemNum() {
        ShoppingCart cart = new ShoppingCart("name");
        cart.addToCart(i3, 3);
        cart.addToCart(i4, 3);
        assertEquals(6, cart.getItemsC());
    }

    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart("name");
        cart.addToCart(i3, 3);
        assertEquals(3, cart.getItemsC());
//        assertEquals("Bread", cart.item.);
    }

    @Test
    public void shouldAddNewProduct() throws Exception {

        /* add the item to the cart */
        cart.addToCart(i1,1);
        cart.addToCart(i2,1);
        cart.addToCart(i3,1);
        cart.addToCart(i4,1);
        cart.addToCart(i5,1);

        // when

        // then
        assertEquals(5, cart.item.size());

    }

    @Test
    public void shouldTotalPriceBeZeroWhenCartEmpty() throws Exception {
        // when
        double totalPrice = cart.getTotalAmount();
        // then
        assertEquals(0, totalPrice,0);
    }

    @Test
    public void shouldCalculateTotalPriceForCart() throws Exception {
        // given

        cart.setShipping(1);
        cart.setState("IL");
        cart.addToCart(i1,1);
        cart.addToCart(i2,1);
        cart.addToCart(i1,1);
        cart.addToCart(i2,1);

        double totalPrice = cart.getTotalAmount();
        // then
        assertEquals(10.00, totalPrice,0);
    }

    @Test
    public void TotalCostTestState() {
        cart.setShipping(1);
        cart.setState("IL");
        cart.addToCart(i1,1);
        cart.addToCart(i2,1);

        double totalPrice = cart.getTotalAmountTax();

        assertEquals(15.90, totalPrice,0.3);
    }

    @Test
    public void TotalCostTestStateOut() {
        cart.setShipping(1);
        cart.setState("NQ");
        cart.addToCart(i1,1);
        cart.addToCart(i2,1);

        double totalPrice = cart.getTotalAmountTax();

        assertEquals(15.0, totalPrice,0.3);
    }

    @Test
    public void TotalCostShip2() {
        cart.setShipping(2);
        cart.setState("NQ");
        cart.addToCart(i1,1);
        cart.addToCart(i2,1);

        double totalPrice = cart.getTotalAmountTax();

        assertEquals(30.0, totalPrice,0.3);
    }

    @Test
    public void RemoveItemtest(){

        cart.setShipping(2);
        cart.setState("NQ");
        assertEquals(cart.item.size(), 0);
        cart.addToCart(i1,1);
        assertEquals(cart.item.size(), 1);
        cart.removeFromCart(i1);
        assertEquals(cart.item.size(), 0);


    }



    /**
     *
     * Iventory
     */

    


/**
 * Shopper
 */


    //NEW TESTS
    @Test
    public void getStateTest(){  // tests the getState fn of ShoppingCart
        cart.setState("IL");
        String totest = cart.getState();
        assertEquals(totest, "IL");
    }
    @Test
    public void getShippingTest(){  //tests getShipping
        cart.setShipping(2);
        int totest = cart.getShipping();
        assertEquals(totest, 2);
    }
    @Test
    public void correctTaxTest(){
        cart.setState("IL");
        double totest = cart.getTax();
        assertEquals(totest, 1.06, 0);
    }
    @Test
    public void noTaxTest(){  //tests for when the state is not one that has a 6% tax rate
        cart.setState("NJ");
        double totest = cart.getTax();
        assertEquals(totest, 1.0,0);

    }
//    @Test
//    public void shippingCostTest(){  //items in cart total to more than $50, so shipping should be free (0)
//        cart.setShipping(2);
//        cart.addToCart(i4, 2);
//        //double totest =
//        assertEquals(cart.shippingCost(), 0, 0);
//    }
    @Test
    public void shippingCostTestlessthan(){//test for when the shipping is "2" and the items in cart are less than $50
        cart.setShipping(2);
        assertEquals(cart.shippingCost(), 25.0, 0);
    }
    @Test
    public void shippingCostTestFirst(){  //test for when shipping is "1" and cart's total is less than $50
        cart.setShipping(1);
        assertEquals(cart.shippingCost(), 10.0, 0);
    }
//    @Before
//    public void Streams() {
//        System.setOut(new PrintStream(outContent));
//        // System.setErr(new PrintStream(errContent));
//    }
//
//    @After
//    public void StreamsBack() {
//        System.setOut(originalOut);
//        //System.setErr(originalErr);
//    }
//    @Test
//    public  void getitemsTest(){
//        cart.addToCart(i4, 1);
//        cart.getItems();
//        assertEquals("Eggs", outContent.toString().trim());
//    }



}



