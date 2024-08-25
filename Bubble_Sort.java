class Bubble_Sort{
    public static void main(String args[])
    {
        int arr[] ={20,10,30,50,40,70,60};
        int size = arr.length;
        int temp = 0;

        System.out.println("Before Sorting Bubble sort :");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] +" ");
        }

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size-i-1; j++)
            {
                if( arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println();
            for(int nums : arr){
            System.out.print(nums +" ");
            }
        }

        System.out.println();
        System.out.println("After Sorting Bubble sort :");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] +" ");
            }
    }
}