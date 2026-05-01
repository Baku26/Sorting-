import java.util.Arrays;


public class BubbleSort {
    
    public static void sort(int[]  arr) {
        if(arr == null || arr.length <= 1) {
            return;
        }
        boolean swapped;
        int n = arr.length;
            
            for(int i = 0; i < n - 1; i++) {
                   swapped = false;
                for( int k = 0; k < i - 1; k++) {
                    if(arr[k] > arr[k+1]) {
                        int temp = arr[k];
                        arr[k] = arr[k+ 1];
                        arr[k + 1] = temp;
                        swapped = true;
                    }
                    
         if (!swapped) {
                break;
        
      }
}
}
}
}

