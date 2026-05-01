public class QuickSortTest {
    public static void main(String[] args) {
        int b[] = { 3, -34, 0, -9, 77, 4, 1, 100};
        int n = b.length;
        
        QuickSort ob = new QuickSort();
        ob.sort(b,0 , n-1);
        
        for(int i = 0; i < n; i++)
        System.out.print(b[i] + " ");
        
        
    }
}