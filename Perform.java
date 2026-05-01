import java.util.Random;
import java.util.ArrayList;

public class Perform {
    public static void fillArray(int[]  arr) {
        
        Random ran = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100000);
            
        }
        }
        public static void fillArrayList(ArrayList<Integer> list , int size) {
            Random ran = new Random();
            for(int i = 0; i < size; i++) {
                list.add(ran.nextInt(100000));
                
            }
            
        }
    }
