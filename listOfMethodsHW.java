import java.io.*;
import java.util.Locale;

public class listOfMethodsHW {
    public static void main(String[] args) {
        // charAt()
        String s = "I will succeed!";
        char result1 = s.charAt(7);
        char result2 = s.charAt(9);
        System.out.println("The seventh element is " + result1);
        System.out.println("The tenth element is " + result2);

        // compareTo()
        String s1 = "I will be a good tester!";
        String s2 = "I will be a good tester!";
        String s3 = "I will be a perfect tester!";

        int res = s1.compareTo(s2);
        System.out.println(res);

        res = s2.compareTo(s3);
        System.out.println(res);

        res = s3.compareTo(s1);
        System.out.println(res);

        // compareToIgnoreCase()
        String s4 = "I Will Be A Good Tester!";
        String s5 = "I will be a good tester!";
        String s6 = "I will be a perfect tester!";

        int res1 = s4.compareToIgnoreCase(s5);
        System.out.println(res1);

        res1 = s5.compareToIgnoreCase(s6);
        System.out.println(res1);

        res1 = s6.compareToIgnoreCase(s4);
        System.out.println(res1);

        // concat()
        String s7 = "I Will Be A Good Tester!";
        s7 = s7.concat(" A perfect Tester!");
        System.out.println(s7);

        // contentEquals()
        String s8 = "I Will Be A Good Tester!";
        String s9 = "I Will Be A Perfect Tester!";
        StringBuffer s10 = new StringBuffer("I Will Be A Good Tester!");
        StringBuffer s11 = new StringBuffer("I feel good!");

        boolean result = s8.contentEquals(s10);
        System.out.println(
                "String \"I Will Be A Good Tester!\" is equal buffer string \"I Will Be A Good Tester!\"?\n" + result);

        result = s9.contentEquals(s10);
        System.out
                .println("String \"I Will Be A Perfect Tester!\" is equal buffer string \"I Will Be A Good Tester!\"?\n"
                        + result);

        result = s8.contentEquals(s11);
        System.out.println("String \"I Will Be A Good Tester!\" is equal buffer string \"I feel good!\"?\n" + result);

        // copyValueOf()
        char[] s12 = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!' };
        String s13 = "";

        s13 = s13.copyValueOf(s12);
        System.out.println("Returned string is \"" + s13 + "\"");

        s13 = s13.copyValueOf(s12, 4, 7);
        System.out.println("Returned string is \"" + s13 + "\"");

        // endsWith()
        String s14 = "I Will Be A Good Tester!";
        boolean retRes;

        retRes = s14.endsWith("Tester!");
        System.out.println("Returned value is " + retRes);

        retRes = s14.endsWith("Tester");
        System.out.println("Returned value is " + retRes);

        // equalsIgnoreCase()
        String s15 = "I Will Be A Good Tester!";
        String s16 = s15;
        String s17 = "I Will Be A Perfect Tester!";
        String s18 = new String("I WILL BE A GOOD TESTER!");

        boolean returnRes = s15.equalsIgnoreCase(s16);
        System.out.println("String " + s15 + " is equal to string " + s16 + " : " + returnRes);

        returnRes = s15.equalsIgnoreCase(s17);
        System.out.println("String " + s15 + " is equal to string " + s17 + " : " + returnRes);

        returnRes = s15.equalsIgnoreCase(s18);
        System.out.println("String " + s15 + " is equal to string " + s18 + " : " + returnRes);

        // equals()
        String s19 = "I Will Be A Good Tester!";
        String s20 = s19;
        String s21 = new String("I Will Be A Perfect Tester!");
        boolean retRes1;
        retRes1 = s19.equals(s20);
        System.out.println("String s19 is equal to string s20 : " + retRes1);

        retRes1 = s19.equals(s21);
        System.out.println("String s19 is equal to string s21 : " + retRes1);

        // getBytes()
        String s22 = new String("Hello World");
        try {
            byte[] s23 = s22.getBytes();
            System.out.println("Returned value is: " + s23);

            s23 = s22.getBytes("UTF-8");
            System.out.println("Returned value is: " + s23);

            s23 = s22.getBytes("ISO-8859-1");
            System.out.println("Returned value is: " + s23);

            s23 = s22.getBytes("World");
            System.out.println("Returned value is: " + s23);
        } catch (UnsupportedEncodingException e) {
            System.out.println("False encoding");// TODO: handle exception
        }

        // getChars()
        String s24 = new String("Welcome to GB");
        char[] s25 = new char[7];

        try {
            s24.getChars(3, 7, s25, 0);
            System.out.println(s25);
        } catch (Exception e) {
            System.out.println("It's exception");// TODO: handle exception
        }

        // hashCode()
        String s26 = new String("Welcome to GB");
        System.out.println("Hash Code for s26 is " + s26.hashCode());

        // intern()
        String s27 = new String("Welcome to GB");
        String s28 = new String("WELCOME TO GB");

        System.out.println("Canonical representation for s27:");
        System.out.println(s27.intern());

        System.out.println("Canonical representation for s28:");
        System.out.println(s28.intern());

        // lastIndexOf()
        String s29 = new String("Welcome to GB");
        String SubStr1 = new String("come");
        String SubStr2 = new String("IT");

        System.out.println("Finding the last index is ");
        System.out.println(s29.lastIndexOf("e"));
        System.out.println("Finding the last index is ");
        System.out.println(s29.lastIndexOf("e", 4));
        System.out.println("Finding the last index is ");
        System.out.println(s29.lastIndexOf(SubStr1));
        System.out.println("Finding the last index is ");
        System.out.println(s29.lastIndexOf(SubStr1, 11));
        System.out.println("Finding the last index is ");
        System.out.println(s29.lastIndexOf(SubStr2));

        // length()
        String s30 = new String("Welcome to GB");
        String s31 = new String("Hello World");

        System.out.println("String length \"Welcome to GB\" is " + s30.length() + ".");
        System.out.println("String length \"Hello World\" is " + s31.length() + ".");

        // matches()
        String s32 = new String("Welcome to GB");

        System.out.println("Returned value is: " + s32.matches("(.*)GB(.*)"));

        System.out.print("Returned value is: ");
        System.out.println(s32.matches("GB"));

        System.out.print("Returned value is: ");
        System.out.println(s32.matches("Welcome(.*)"));

        // regionMatches()
        String s33 = new String("Welcome to GB");
        String s34 = new String("GB");
        String s35 = new String("gb");

        System.out.println("Returned value is: ");
        System.out.println(s33.regionMatches(2, s34, 0, 8));

        System.out.println("Returned value is: ");
        System.out.println(s33.regionMatches(2, s35, 0, 8));

        System.out.println("Returned value is: ");
        System.out.println(s33.regionMatches(true, 0, s35, 0, 1));

        // replace()
        String s36 = new String("Welcome to GB");

        System.out.println("Returned value is: " + s36.replace("t", "d"));

        System.out.println("Returned value is: " + s36.replace("o", "a"));

        // replaceAll()
        String s37 = new String("Welcome to GB");

        System.out.println("Returned value is: ");
        System.out.println(s37.replaceAll("(.*)to(.*)", "You are welcome"));

        System.out.println("Returned value is: ");
        System.out.println(s37.replaceAll("GB", "the best IT-school"));

        // replaceFirst()
        String s38 = new String("Welcome to GB");

        System.out.println("Returned value is: ");
        System.out.println(s38.replaceFirst("(.*)to(.*)", "You are welcome"));

        System.out.println("Returned value is: ");
        System.err.println(s38.replaceFirst("GB", "IT"));

        String s39 = new String("Welcome to GB! Welcome to GB!");
        System.out.println(s39.replaceFirst("Welcome to GB", "It's IT"));

        // split()
        String s40 = new String("Welcome to GB");

        System.out.println("Returned value is: ");
        for (String retval : s40.split(" ", 2)) {
            System.out.println(retval);
        }

        System.out.println("Returned value is: ");
        for (String retval : s40.split(" ", 1)) {
            System.out.println(retval);
        }

        System.out.println("Returned value is: ");
        for (String retval : s40.split(" ", 0)) {
            System.out.println(retval);
        }

        System.out.println("Returned value is: ");
        for (String retval : s40.split(" ")) {
            System.out.println(retval);
        }

        // startsWith()
        String s41 = new String("Welcome to GB");

        System.out.println("Returned value is: " + s41.startsWith("Welcome"));

        System.out.println("Returned value is: " + s41.startsWith("GB"));

        System.out.println("Returned value is: " + s41.startsWith("GB", 11));

        // subSequence()
        String s42 = new String("Welcome to GB");

        System.out.print("Returned value is: ");
        System.out.println(s42.subSequence(0, 7));

        System.out.println("Returned value is: " + s42.subSequence(8, 13));

        // substring()
        String s43 = new String("Welcome to GB");

        System.out.println("Returned value is: " + s43.substring(3, 7));
        System.out.println("Returned value is: " + s43.substring(11));

        // toCharArray()
        String s44 = new String("Welcome to GB");
        System.out.println("Returned value is " + s44.toCharArray());

        // toLowerCase()
        String s45 = new String("Welcome to GB");
        System.out.println("Returned value is: " + s45.toLowerCase());

        // toString()
        String s46 = new String("Welcome to GB");
        System.out.println("Returned value is: " + s46.toString());

        // toUpperCase()
        String s47 = new String("Welcome to GB");
        System.out.println("Returned value is " + s47.toUpperCase());

        // trim()
        String s48 = new String("     Welcome to GB    ");
        System.out.print("Returned value is: ");
        System.out.println(s48.trim());

        // valueOf()
        double d = 15489665.588;
        boolean b = false;
        float f = 6363;
        int i = 458;
        long l = 123456754;
        char[] arr = { 'a', 'b', 'c', 'd', 'e' };

        System.out.println("Returned value is " + String.valueOf(d));
        System.out.println("Returned value is " + String.valueOf(b));
        System.out.println("Returned value is " + String.valueOf(f));
        System.out.println("Returned value is " + String.valueOf(i));
        System.out.println("Returned value is " + String.valueOf(l));
        System.out.println("Returned value is " + String.valueOf(arr));

    }
}
