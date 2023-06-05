import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Iventory {
    static List<Item> itemlist = new ArrayList<>();
    private HashMap<String, Double> itemlist_map = new HashMap<String, Double>();


    Item item;

//    public Iventory() {
//
//        this.itemlist.put(item.getProductName(), item.getUnitPrice());
//
//    }

    public void add(Item item){
        itemlist.add(item);
        itemlist_map.put(item.getProductName(),item.getUnitPrice());
    }

    public static Item findList(String name){
        for(Item item : itemlist){
            if (Objects.equals(item.getProductName() , name));
            {
                return item;
            }
        }
        return null;
    }

    public void ItemList() {
        for (String i : itemlist_map.keySet()) {
            System.out.println("Product: " + i + " Price: " + itemlist_map.get(i));
        }
    }
}
