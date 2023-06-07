import org.junit.Test;

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


    /***
     * Item
     */

    @Test
    public void testSetName() {
        Item item = new Item("apple", 1.0);
        item.setProductName("orange");
        assertEquals("orange", item.getProductName());
    }

    @Test
    public void testGetName() {
        Item item = new Item("berry", 1.0);
        assertEquals("berry", item.getProductName());
    }

    @Test
    public void testSetPrice() {
        Item item = new Item("berry", 1.0);
        item.setUnitPrice(2.0);
        assertEquals(2.0, item.getUnitPrice(), 0);
    }

    @Test
    public void testGetPrice() {
        Item item = new Item("yellow", 1.0);
        assertEquals(1.0, item.getUnitPrice(),0);
    }


    /**
     *
     * Iventory
     */

    
    //Test if item is added to iventory
    @Test
    public void ivenTest() {
        Item item = new Item("yellow", 1.0);
        Iventory iventory  = new Iventory();
        iventory.add(item);
        assertEquals(item, iventory.findList(item.getProductName()));
    }

/**
 * Shopper
 */

@Test
public void ShopperTest() {
    String name = "ayyub";
    Shopper person = new Shopper();
    person.setName(name);
    assertEquals(name, person.getName());
}




}



