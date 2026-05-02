import java.util.ArrayList;

public class PerformTest {
    public static void main(String[]  args) {
        for(int size = 1000; size <= 100000; size += 1000) {
            
            int[] arr = new int[size];
            Perform.fillArray(arr);
            long startTime = System.currentTimeMillis();
            
            long endTime = System.currentTimeMillis();
            System.out.println("array | size:" + size + "time:" + (endTime - startTime) + "ms");
            
            
            ArrayList<Integer> list = new ArrayList<>();
            startTime = System.currentTimeMillis();
             Perform.fillArrayList(list, size); 
            endTime = System.currentTimeMillis();
            System.out.println("arrayList | size:" + size + "time:" + (endTime - startTime) + "ms");
        
        }
    }
}
