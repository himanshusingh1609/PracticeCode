package gfgexamples;


    class Triangle {
        int x, y;
        void printArea()
        {
            System.out.println("Area of triangle is: " + x * y / 2);
        }
    }

    class UseTriangle {
        public static void main(String args[])
        {
            // Object creation
            Triangle t = new Triangle();
            t.x = 10;
            t.y = 13;
            t.printArea();
        }
    }

