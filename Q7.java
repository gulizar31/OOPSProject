package ProjectJavaOOPS;

public class Q7 {
    //Count the Number of Words in a String: Write a function to count the number of words in a given string.
    // Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.

    public static void main(String[] args) {

        String hn = "Hello, 2024";
        String [] hnArr=hn.split("[,]");
        System.out.println(hnArr.length);
    }
}
