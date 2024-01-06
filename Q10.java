package ProjectJavaOOPS;

import java.util.ArrayList;
import java.util.HashSet;

public class Q10 {
    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<>();
        aList.add("Alin");
        aList.add("Gulizar");
        aList.add("Bayram");
        aList.add("Gulizar");
        aList.add("Adem");


        HashSet<String> set = new HashSet<>(aList);
        System.out.println(set);
    }
}
