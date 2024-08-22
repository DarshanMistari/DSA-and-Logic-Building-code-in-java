// Print the Fibonacci Sequence till n term

public class Recursion_Practice_No5 {

    public static void printFibonacciNum(int a, int b, int num)
    {
        if(num == 0)
        {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacciNum(b, c, num-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int num = 7;
        System.out.println("Fibonaccis Series :");
        System.out.println(a);
        System.out.println(b);
        printFibonacciNum(a, b, num-2);
    }
}
