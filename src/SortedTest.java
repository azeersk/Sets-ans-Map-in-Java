import java.util.SortedSet;
import java.util.TreeSet;
public class SortedTest {
    public static void main(String[] args){
        SortedSet rollNumbers = new TreeSet<>();
        for(int i = 1; i<=10; i++){
            rollNumbers.add(i);
        }
        System.out.println(rollNumbers);
        System.out.println("first : " + rollNumbers.first());
        System.out.println("last : " + rollNumbers.last());
        System.out.println("head of : " + rollNumbers.headSet(5));
        System.out.println("tail of : " + rollNumbers.tailSet(5));
        System.out.println("sub set of : " + rollNumbers.subSet(2,7));
        System.out.println("comparator of : " + rollNumbers.comparator());
    }
}
