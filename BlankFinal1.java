package gfgexamples;

// A sample Java program to demonstrate use and
// working of blank final
class Tests
{
    // We can initialize here, but if we initialize here,
    // then all objects get the same value.  So we use blank
    // final
    final int i;

    Tests(int x)
    {
        // Since we have already declared i as final above,
        // we must initialize i in constructor. If we remove
        // this line, we get compiler error.
        i = x;
    }
}

// Driver Code
class BlankFinal1
{
    public static void main(String args[])
    {
        Tests t1 = new Tests(10);
        System.out.println(t1.i);

        Tests t2 = new Tests(20);
        System.out.println(t2.i);
    }
}