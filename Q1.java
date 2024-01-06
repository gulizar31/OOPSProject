package ProjectJavaOOPS;

public class Q1 {
    //1. Write a program to swap 2 String without a temporary variable?

    public static void main(String[] args) {

        String x="new";
        String y="years";

        x=x+y;
        y=x.substring(0,(x).length()-y.length());
        x=x.substring(y.length());

        System.out.println(x);
        System.out.println(y);

            }
        }
