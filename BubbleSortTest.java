import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[]  args) {
        
        int[] data = { 100, 35, 2, 0, 200};
        new BubbleSort().sort(data);
       
       System.out.println("sorted array:" + Arrays.toString(data));
        
    
    }
   
    }
