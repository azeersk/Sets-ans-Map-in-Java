import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapTest {
    public static void main(String[] args){
        Map map = new HashMap<String,String>();
        map.put("name: ","Azeer");
        map.put("name1: ","prasad");
        map.put("name2: ","Saheb");
        map.put("name3: ","Shaik");
        System.out.println(map);
        map.put("name2: ","saheb");

        Set KeySet = map.keySet();
        System.out.println(KeySet);
        Collection value = map.values();
        System.out.println(value);
        System.out.println(map.containsValue("prasad"));
    }
}
