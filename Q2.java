package ProjectJavaOOPS;

public class Q2 {
    public static void main(String[] args) {


        // Find out how many alpha characters are present in a string?
        String given="7jgfdRFGVK8***!HDFDf";
        String replaced=given.replaceAll("[^A-Za-z]","");
        System.out.println(replaced.length());

    }

}
