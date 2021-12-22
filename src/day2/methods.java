package day2;

public class methods {

    class ClassDemo {
        //variables
        static int a;
        int b;

        //static block
        static {
            System.out.println("Static block is executed...");
            a = 10;
            staticDemoMethod();
        }

        //IIB
        {
            System.out.println("IIB block is executed...");
            b=10;
            System.out.println(b);
        }

        //Default Constructors
        ClassDemo() {
            System.out.println("Default Const is executed...");
        }

        //Parameterised Constructors
        ClassDemo(int bVal) {
            b = bVal;
            System.out.println("Parametrised Const is executed...");
        }

        //Parameterised Constructors
        ClassDemo(float bValc) {

        }
        // ClassDemo obj = new ClassName();
        // ClassDemo obj = new ClassName(10.2f);
        // ClassDemo obj = new ClassName(10, "abc");
        //Parameterised Constructors
        ClassDemo(int bVal, String bVal2) {
            b = bVal;
        }

        static void staticDemoMethod() {
            System.out.println("Static demo method called");
            System.out.println(a);
        }

        void nonStaticMethodDemo() {
            System.out.println("Non Static demo method called");
            System.out.println(b);
        }
    }
    // Main method
    class Main {
        public void main(String[] args) {
            //ClassDemo demo1 = new ClassDemo();
            ClassDemo demo2 = new ClassDemo(20);
            demo2.staticDemoMethod();
            demo2.nonStaticMethodDemo();
            System.out.println(demo2.a);
            System.out.println(demo2.b);
        }
    }
}
