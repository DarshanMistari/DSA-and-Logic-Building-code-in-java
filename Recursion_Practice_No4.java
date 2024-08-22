// Print Factorial of Number N

public class Recursion_Practice_No4 {
    
    public static int calcFactorial(int num){

        if(num == 1 || num == 0){
            return 1;
        }

        int fact_nm1 = calcFactorial(num -1);
        int fact_n = num * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        
        int num = 5;
        int factorial = calcFactorial(num);
        System.out.println("Factorail Number :"+factorial);

    }
}
