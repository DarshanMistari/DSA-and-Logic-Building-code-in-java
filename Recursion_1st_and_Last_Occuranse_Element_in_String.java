// Find the 1st and Last ocuurance of an element in string

class Recursion_1st_and_Last_Occuranse_Element_in_String{

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str,int idx, char element){
        if(idx == str.length()){
            System.out.println("first");
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurance(str, idx+1,element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a');
        
    }
}