

public class LinearBinarySearchTest {
    public static void main(String[]  args) {
        LinearBinarySearch ls = new LinearBinarySearch();
        
        int[] sortedNumbers = {3,6,7,8,14,27,36,44,59,62,77,93};
        
        boolean found1 = ls.search(sortedNumbers, 27);
        System.out.println("result for 27 is :" + found1);
        
        boolean found2 = ls.search(sortedNumbers, 1);
        System.out.println("result for 1 is :" + found2);
        
        boolean found3 = ls.search(sortedNumbers, 93);
        System.out.println("result for 93 is:" + found3);
        
        boolean found4 = ls.search(sortedNumbers, 0);
        System.out.println("results for 0 is:" + found4);
        
        boolean found5 = ls.search(sortedNumbers, 59);
        System.out.println("results for 59 is :" + found5);
        
        boolean found6 = ls.search(sortedNumbers, 100);
        System.out.println("result for 100 is:" + found6);
        
        boolean found7 = ls.search(sortedNumbers, 6);
        System.out.println("result for 6 is:" + found7);
        
        
    }
    
}
   

