package ProjectJavaOOPS;

import java.util.ArrayList;
import java.util.List;

public class Q8 {

    public static void main(String[] args) {

        List<String> stringList = List.of("Apple", "Banana", "Orange", "Avocado", "Grapes");

        List<String> filteredAndLowerCaseList = filterAndConvertToLowercase(stringList);

        System.out.println("Original List: " + stringList);
        System.out.println("Filtered and Lowercase List: " + filteredAndLowerCaseList);
    }

    private static List<String> filterAndConvertToLowercase(List<String> inputList) {
        List<String> result = new ArrayList<>();

        for (String str : inputList) {
            if (str.startsWith("A")) {
                result.add(str.toLowerCase());
            }
        }
        return result;
    }

}
