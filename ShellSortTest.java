import java.util.Arrays;

public class ShellSortTest {
    public static void main(String[]  args) {
        
        int[] data1 = { 5, 56, 32, 9, 21,33, 28, 42};
        System.out.println("orignial 1:" + Arrays.toString(data1));
        ShellSort.sort(data1);
        System.out.println("sorted 1:" + Arrays.toString(data1));
        
        
        
        int[] data2 = { 4, 79, 5, 12, 45 , 89, 100, 0};
        System.out.println("orignial 2:" + Arrays.toString(data2));
        ShellSort.sort(data2);
        System.out.println("sorted 2:" + Arrays.toString(data2));
        

    }
}