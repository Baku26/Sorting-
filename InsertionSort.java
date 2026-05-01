

public class InsertionSort
{
    public static void Sort(int[]  arr) {
        for(int i = 1; i < arr.length - 1; i++) {
            int currentValue = arr[i];
            int k = i - 1;
            
           while (k >= 0 && arr[k] > currentValue) {
               arr[k + 1] = arr[k];
               k--;
               
           }
           arr[k + 1] = currentValue;
        }
    }
    
    }
