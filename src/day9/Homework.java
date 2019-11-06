package day9;

public class Homework {
//https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
  
  
  //
//class TECHNO4 {
//    public
//    static void main(String[] args)
//    {
//        throw new ArithmeticException();
//    }
//} 
////Options:
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion
//
//class TECHNO5 {
//    static ArithmeticException ae = new ArithmeticException();
//    public static void main(String[] args)
//    {
//        throw ae;
//    }
//} 
////Options:
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion
//
//class TECHNO6 {
//    static ArithmeticException ae;
//    public
//    static void main(String[] args)
//    {
//        throw ae;
//    }
//} 
////Options:
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:NullPointerException
////3. No Output
////4. RuntineException:ArithmeticExcetion
//
//class TECHNO7 {
//    public static void main(String[] args)
//    {
//        throw new ArithmeticException("/ by zero");
//        System.out.println("Hello TECHNO");
//    }
//} 
////Options:
////1. Run-time Exception
////2. Compile-time error
////3. No Output
////4. Compile-time Exception
//
//class TECHNO8 {
//    public
//    static void main(String[] args)
//    {
//        throw new TECHNO();
//        System.out.println("Hello TECHNO");
//    }
//} 
////Options:
////1. Hello TECHNO
////2. No Output
////3. Run-time Exception
////4. Compile-time error
////
////The answer is option (4)

  
//class TECHNO throws ArithmeticException
//{
//    public static void main(String[]args) throws ArithmeticException
//    {
//        System.out.println(10/0);
//        System.out.println("Hello TECHNO");
//    }
//}
//
////Options:
////1. Hello TECHNO
////2. No Output
////3. Run-time Exception
////4. Compile time error
//
//class TECHNO2 {
//    public static void main(String[] args) throws TECHNO2 {
//        Thread.sleep(10000);
//        System.out.println("Hello TECHNO");
//    }
//}
////Options:
////1. Hello TECHNO
////2. compile time error
////3. No Output
////4. Run-time exception
//
//class Test {
//    void m1() throws ArithmeticException {
//        throw new ArithmeticException("Calculation error");
//    }
//
//    void m2() throws ArithmeticException {
//        m1();
//    }
//
//    void m3() {
//        try {
//            m2();
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException");
//        }
//    }
//
//    public static void main(String args[]) {
//        Test t = new Test();
//        t.m3();
//        System.out.println("Handled by TECHNO");
//    }
//}
////Options:
////1. Calculation error
////2. ArithmeticException
////3. Handled by TECHNO
////4. ArithmeticException Handled by TECHNO
//
//class Test2 {
//    void Div() throws ArithmeticException {
//        int a = 25, b = 0, rs;
//        rs = a / b;
//        System.out.print("\n\tThe result is : " + rs);
//    }
//
//    public
//    static void main(String[] args) {
//        Test2 t = new Test2();
//        try {
//            t.Div();
//        } catch (ArithmeticException e) {
//            System.out.print("\n\tError : " + e.getMessage());
//        }
//        System.out.print("\n\tBYE TECHNO");
//    }
//}
////Options:
////1. BYE TECHNO
////2. Compile time error
////3. Error: / by zero
////4. Error : / by zero
////BYE TECHNO
//
//class Test3 {
//    public static void main(String[] args) {
//        fun();
//    }
//
//    public static void fun() {
//        moreFun();
//    }
//
//    public static void moreFun() throws InterruptedException {
//        Thread.sleep(10000);
//        System.out.println("TECHNO");
//    }
//}
////Options:
////1. TECHNO
////2. No Output
////3. Compile time error
////4. Run-time Exception



}
