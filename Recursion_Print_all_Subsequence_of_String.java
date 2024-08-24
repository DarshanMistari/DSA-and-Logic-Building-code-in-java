
import java.util.HashSet;

// Print all the SubSequences of a String

public class Recursion_Print_all_Subsequence_of_String {
    
    public static void Subsequences(String str,int idx,String newString, HashSet<String> set){
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }         
        
        char currChar = str.charAt(idx);
        // to be
        Subsequences(str, idx+1, newString + currChar ,set);

        // or not to be
        Subsequences(str, idx+1, newString,set );
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
       String str = "abc";
       Subsequences(str, 0, "",set);
    }
}
