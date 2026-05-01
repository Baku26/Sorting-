import java.util.Arrays;

public class SelectionSort
{
    public static void Sort(int[]  arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            
        int n = arr.length;            
        int minIndex = i;
        
        for(int k = i + 1; k < n; k++) {
            if(arr[k] < arr[minIndex]) {
                minIndex = k;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    
        
    }
    
}

}