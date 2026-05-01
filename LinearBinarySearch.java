

public class LinearBinarySearch {
    
    public static boolean search(int[] list, int target) {
        System.out.println("noted: start the search for a value at : "  + target);
        
        int lowerBound = 0;
        int upperBound = list.length - 1;
        
        while(lowerBound <= upperBound) {
            if(list[lowerBound] == target || list[upperBound] == target) {
                return true;
                
            }
            int minIndex = lowerBound + (upperBound - lowerBound) / 2;
            System.out.println("checking the min index at :" + minIndex + "value :" + list[minIndex] + ")");
            
            if(list[minIndex] == target) {
                return true;
            }
            if( target < list[minIndex]) {
                upperBound = minIndex - 1;
                System.out.println("updating the upperBound to :" + upperBound);
                
            }
            else {
                lowerBound = minIndex + 1;
                System.out.println("updating the lowerBound to :" + lowerBound);
                
            }
        }
        return false;
    }
  
}
    
    
