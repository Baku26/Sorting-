public class QuickSort {
    
     public int partition(int b[], int low, int high) {
        
        int pivot = b[high];
        int i = (low - 1);
        for(int k = low; k < high; k++) {
            if (b[k] <+ pivot) {
                i++;
                
                int temp = b[i];
                b[i] = b[k];
                b[k] = temp;
                
            }
        }
        int temp = b[i+1];
        b[i+1] = b[high];
        b[high] = temp;
        return i+1;
    }    
     public void sort(int b[], int l, int h) {
        if(l < h) {
            int pi = partition(b, l, h);

            sort(b, l, pi - 1);
            sort(b, pi+1, h);
            
        }
    }
}