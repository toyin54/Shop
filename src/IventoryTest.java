import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IventoryTest {

    Item i1 = new Item("Olive Oil 1l", 3);
    Item i2 = new Item("Cheese Slices", 2);
    Item i3 = new Item("Bread", 1);
    Item i4 = new Item("Eggs", 50);
    Item i5 = new Item("Chicken Salami", 2);


    Shopper jose = new Shopper();
    ShoppingCart cart = new ShoppingCart("name");

    //Test if item is added to iventory
    @Test
    public void ivenTest() {
        Item item = new Item("yellow", 1.0);
        Iventory iventory  = new Iventory();
        iventory.add(item);
        assertEquals(item, iventory.findList(item.getProductName()));
    }
}
