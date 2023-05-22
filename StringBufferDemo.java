package gfgexamples;

public class StringBufferDemo
{
    public static void main(String[] args)
    {

        // Reading passed string
        StringBuffer sbf
                = new StringBuffer("Geeksforgeeks");

        // Printing the string
        System.out.println("String buffer = " + sbf);

        // Appending the CodePoint as String to the string
        // buffer
        sbf.appendCodePoint(65);

        // Printing the string again after
        // appending codePoint as string
        System.out.println("After appending CodePoint is = "
                + sbf);
    }
}
