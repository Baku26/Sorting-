public class HeapSort {
    public void sort(int[]  arr) {
        int n = arr.length;
        
        for( int i = n / 2 - 1; i>= 0; i--) 
            heapify(arr, n, i);
            
            for( int i = n - 1; i > 0; i--) {
                 int temp = arr[0];
                 arr[0] = arr[i];
                 arr[i] = temp;
                 
                 heapify(arr, i , 0);
    
            
        }
        
    }
     public void heapify(int arr[], int  n, int i) {
         int largest = i, b = 2 * i + 1, a = 2 * i + 2;
         if( b < n && arr[b] > arr[largest]) largest = b;
         if( a < n && arr[a] > arr[largest]) largest = a;
                 
             if(largest != i) {
                 int swap = arr[i];
                 arr[i] = arr[largest];
                 arr[largest] = swap;
                 
                 heapify(arr, n , largest);
                 
             }
             }
             
         }
         
 