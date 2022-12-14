import java.util.Arrays;


public class Section51{

    static void sort(int[] arr){

        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }    }

    public static void main(String[] args) {
        System.out.println("Start");
        int[] arr = {3,4,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The END");
        System.out.println("ABSJFSJ");
        
    }
}