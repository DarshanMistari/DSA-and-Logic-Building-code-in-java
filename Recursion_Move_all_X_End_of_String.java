// Move all 'X' to the end of String

public class Recursion_Move_all_X_End_of_String {
    
    public static void moveAllX(String str, int idx, int count,String newString){

        if(idx == str.length()){
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbxcd";
        moveAllX(str, 0, 0, "");
    }
}
