public class InsertionSortTest {
    public static void main(String[]  args) {
        
      int data[] = {7, 3, 0, 2, 8};
        long totalStart = System.nanoTime();
      InsertionSort.Sort(data);
        long endTime = System.nanoTime();
      System.out.print("sorted array list");
      for(int num : data) {
          System.out.println(num + " ");

        double durationsMs = ( endTime - startTime) / 1_000_000;
           System.out.println("\n\nTotal Sort Time: " + durationsMs + " ms");
          
      }
      }
      
    }
