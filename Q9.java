package ProjectJavaOOPS;

public class Q9 {
    //Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character.
    // For example, in the string "abracadabra", the first non-repeating character is 'c'.

        public static void main(String[] args) {
            String s="abracadabra";
            for (int i = 0; i < s.length(); i++) {
                if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
                    System.out.println("First non-repeating character is " + s.charAt(i));
                    break;

                }
            }
        }


    }

