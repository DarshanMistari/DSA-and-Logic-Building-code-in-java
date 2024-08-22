// Print Sum of first N Natural Numbers 

public class Recursion_Practice_No3 {
    
    public static void printSum(int i, int num, int sum){
        if(i == num)
        {
            sum += i;
            System.out.println("Sum of N natural Number :"+sum);
            return;
        }
        sum += i;
        printSum(i+1, num, sum);

    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
