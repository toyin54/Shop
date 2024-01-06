import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopperTest {

    @Test
    public void ShopperTest1() {
        String name = "ayyub";
        Shopper person = new Shopper();
        person.setName(name);
        assertEquals(name, person.getName());
    }

    
    @Test
    public void ShopperTest2() {
        String name = "mark";
        Shopper person = new Shopper();
        person.setName(name);
        assertEquals(name, person.getName());
    }
}
