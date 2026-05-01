

public class SelectionSortTest {
    public static void main(String[]  args) {
        
        SelectionSort st = new SelectionSort();
        
        int data1[] = { 5, 7, 9, 2, 14, 6, 1, 4};
        System.out.println("Origial array");
        
        
        SelectionSort.Sort(data1);
        
        int data2[] = { 3, 0, 5, 11, -200 , 10000};
        System.out.println("standard array"); 
        
        
        SelectionSort.Sort(data2);
        
              for(int num : data1) {
          System.out.println(num + " ");
            
   }
   
         for(int num : data2) {
          System.out.println(num + " ");
        }
    }
}