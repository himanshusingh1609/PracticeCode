package gfgexamples;

class  Testss
{
    final public int i;
    Testss (int val )
    {
        this.i=val;
    }
    Testss()
    {
        //Calling Test(int val)
        this(10);
    }

    public static void main(String[] args) {
        Testss t1=new Testss();
        System.out.println(t1.i);

        Testss t2=new Testss(20);
        System.out.println(t2.i);

    }
}