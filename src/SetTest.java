import java.util.Set;
import java.util.HashSet;
public class SetTest {
    public static void main(String[] args){
        Set names = new HashSet<>();
        names.add("azeer");
        names.add("prasad");
        names.add("saheb");
        names.add(13);
        names.add("shaik");
        names.add("azeer");
        names.add(12);
        names.add(null);
        System.out.println(names);
    }
}
