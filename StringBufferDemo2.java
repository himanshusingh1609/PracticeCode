package gfgexamples;

public class StringBufferDemo2 {
    public static void main(String[] args) {

        // Reading passed string by creating object of class
        StringBuffer sbf
                = new StringBuffer("Geeksforgeeks");


        System.out.println("String buffer = " + sbf);

        // Here it appends the CodePoint as
        // string to the string buffer
        sbf.appendCodePoint(54);

        System.out.println("After appending CodePoint is = "
                + sbf);
    }
}
