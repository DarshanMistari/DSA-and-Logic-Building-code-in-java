public class Recursion_Practice_Print_Reverse_String {

    public static void printRevStr(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRevStr(str, idx - 1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printRevStr(str, str.length()-1);
    }
}
