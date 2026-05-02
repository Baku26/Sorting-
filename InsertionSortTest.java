public class InsertionSortTest {
    public static void main(String[]  args) {
        
      int data[] = {7, 3, 0, 2, 8};
        long totalStart = System.nanoTime();
      InsertionSort.Sort(data);
      
      for(int num : data) {
          System.out.println(num + " ");

          long constStart = System.nanoTime();
        
        long constEnd = System.nanoTime();
        
        long searchStart = System.nanoTime();
       
        long searchEnd = System.nanoTime();
        
      
        long totalEnd = System.nanoTime();
        
        System.out.println("construction : " + (constEnd - constStart) / 1e6 + "ms");
        System.out.println("searching :" + (searchEnd - searchStart) / 1e6 + "ms");
        System.out.println("Total:" + (totalEnd - totalStart) / 1e6 + "ms");
          
      }
      }
      
    }
