public class Exception_Propagation
{
    static void method1()
    {
        // This will throw ArithmeticException
        int result = 10 / 0;
    }

    static void method2()
    {
        method1();
    }

    public static void main(String[] args)
    {
        try
        {
            method2();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Handled exception in main");
        }
    }
}
