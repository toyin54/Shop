import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {
    Item i1 = new Item("Olive Oil 1l", 3);
    Item i2 = new Item("Cheese Slices", 2);
    Item i3 = new Item("Bread", 1);
    Item i4 = new Item("Eggs", 50);
    Item i5 = new Item("Chicken Salami", 2);


    Shopper jose = new Shopper();
    ShoppingCart cart = new ShoppingCart("ds");



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
    public void TotalCostTest() {
    	cart.setShipping(1);
    	cart.setState("IL");
        cart.addToCart(i1,1);
        cart.addToCart(i2,1);
        
        double totalPrice = cart.getTotalAmountTax();
        
        assertEquals(15.60, totalPrice,0000.1);
    }


}



