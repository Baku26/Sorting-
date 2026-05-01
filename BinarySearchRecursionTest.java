
public class BinarySearchRecursionTest
{
    public static void main(String[]  args) {
        int[] sortedArr = {4, 7, 9, 14, 27, 33, 67, 78, 99};
        int target = 27;
        
        int result = BinarySearchRecursion.recursiveSearch(sortedArr, 0, sortedArr.length - 1, target);
        
        if( result !=-1 ) {
            System.out.println("element is found at index:" + result);
            
        }
        else {
            System.out.println("element is not found in the index");

        long totalStart = System.nanoTime();
        
        long constStart = System.nanoTime();
        
        long constEnd = System.nanoTime();
        
        long searchStart = System.nanoTime();
        
        long searchEnd = System.nanoTime();
        
      
        long totalEnd = System.nanoTime();
        }
    }
}
