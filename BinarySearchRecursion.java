public class BinarySearchRecursion {
    public static int recursiveSearch(int[] arr, int left, int right, int target) {
        if(left > right ) {
            return -1;
        }      
        int mid = left + (right - left) / 2;
        if(arr[mid] == target) {
            return mid;
        }   
                if(arr[mid] > target) {
            return recursiveSearch(arr, right, mid - 1, target);
            
        }
        return recursiveSearch(arr, mid + 1, left, target);
    }
       }
       
    

