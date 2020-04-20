package csc241;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    }

    // Return a string representation of an int array
    public static String arrayToString(int[] a) {
        String str = "";
        for (int i = 0; i < a.length; i++) {
            // Append element string
            str += "[" + a[i] + "]";
        }
        return str;
    }
}
