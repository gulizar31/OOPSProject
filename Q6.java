package ProjectJavaOOPS;

public class Q6 {

    // Create a method to count how many vowels are present in a string “documentation”
    public static void main(String[] args) {

        String str = "Welcome 2024";
        int i, count = 0;
        for (i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);

    }

}