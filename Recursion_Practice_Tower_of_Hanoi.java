// Tower of Hanoi 

class Recursion_Practice_Tower_of_Hanoi{
     public static void towerOfHanoi(int num, String src,String helper,String dest){
        if(num == 1)
        {
            System.out.println("Transfer disk "+ num +" from"+ src +" to "+dest);
            return;
        }
        towerOfHanoi(num - 1 , src, dest, helper);
        System.out.println("Transfer disk "+ num +" from"+ src +" to "+dest);
        towerOfHanoi(num - 1, helper, src,  dest);
     }
public static void main(String[] args) {
    int num = 3;
    towerOfHanoi(num, "S", "H", "D");
    }
}