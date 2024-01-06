import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

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

}
