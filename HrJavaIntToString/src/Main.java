
/*
Java Int to String
You are given an integer , you have to convert it into a string.

        n can range between -100  to 100 inclusive.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        try {
            n = in.nextInt();
            String str = Integer.toString(n);
            System.out.println("Str = " + str);
        }
        catch (Exception e) {
            System.out.println("User input is not required type (Int).");
        }
    }
}
