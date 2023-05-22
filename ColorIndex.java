package gfgexamples;


    enum ColorI {
        RED,
        GREEN,
        BLUE;
    }

    public class ColorIndex 
    {
        public static void main(String[] args) 
        {
            // Calling values()
            ColorI arr[] = ColorI.values();

            // enum with loop
            for (ColorI col : arr) {
                // Calling ordinal() to find index
                // of color.
                System.out.println(col + " at index "
                        + col.ordinal());
            }

            // Using valueOf(). Returns an object of
            // ColorI with given constant.
            // Uncommenting second line causes exception
            // IllegalArgumentException
            System.out.println(ColorI.valueOf("RED"));
            // System.out.println(ColorI.valueOf("WHITE"));
        }
    }

