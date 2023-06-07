import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopperTest {

    @Test
    public void ShopperTest() {
        String name = "ayyub";
        Shopper person = new Shopper();
        person.setName(name);
        assertEquals(name, person.getName());
    }

}
