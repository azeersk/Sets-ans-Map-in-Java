import java.util.TreeSet;
public class NavigableTest {
    public static void main(String[] args){
        TreeSet ar = new TreeSet<>();
        for( int a = 1; a<=10; a++){
            ar.add(a);
        }
        System.out.println(ar);
        System.out.println("ceiling value: "+ ar.ceiling(6));
        System.out.println("higher value: "+ ar.higher(5));
        System.out.println("floor value: "+ ar.floor(5));
        System.out.println("lower value: "+ ar.lower(5));
        System.out.println("poll first value: "+ ar.pollFirst());
        System.out.println("descending order: "+ ar.descendingSet());
    }
}
