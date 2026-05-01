public class HeapSortTest {
    public static void main(String[]  args) {
        
        int arr[] = {9, 19, 11, 24, 6, 0 , 10 , 15, 22, 87};
        new HeapSort().sort(arr);
        System.out.println("sorted array:" + java.util.Arrays.toString(arr));
        
        
    }
}