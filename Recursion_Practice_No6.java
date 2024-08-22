// Print x^n ( stack heigth n)

public class Recursion_Practice_No6 {
    
    public static int calcPower(int x, int num)
    {
        if(num == 0)
        {
            return 1;
        }
        if(x == 0)
        {
            return 0;
        }

        int xPownm1 = calcPower(x, num-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        int x = 2;
        int num = 5;
        int ans = calcPower(x, num);
        System.out.println("X^n Power :"+ans);
    }
}
