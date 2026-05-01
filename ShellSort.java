

public class ShellSort
{
    public static void sort(int[]  arr) {
        int n = arr.length;
        
        for(int gap = n / 2; gap > 0; gap /=2) {
            for(int i = gap; i < n; i++) {
                int temp = arr[i];
                int l = i;
                
                while( l >= gap && arr[l - gap] > temp) {
                    arr[l] = arr[l - gap];
                    l -= gap;
                    
                }
                arr[l] = temp;
            }
        }
    }
}
