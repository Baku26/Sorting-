import java.util.Random;

public class BinarySearchTreeTest {
    public static void main(String[]  args) {
        
        
        BinarySearchTree bt = new BinarySearchTree();
        Random rng = new Random();
        int l = 100000;
        int[] data = new int [l];
        for(int i = 0; i < l ; i++) data[i] = rng.nextInt(100000);
        int target = data[rng.nextInt(l)];
        
        long totalStart = System.nanoTime();
        
        long constStart = System.nanoTime();
        for(int val : data) bt.insert(val);
        long constEnd = System.nanoTime();
        
        long searchStart = System.nanoTime();
        bt.contains(target);
        long searchEnd = System.nanoTime();
        
      
        long totalEnd = System.nanoTime();
        
        System.out.println("construction : " + (constEnd - constStart) / 1e6 + "ms");
        System.out.println("searching :" + (searchEnd - searchStart) / 1e6 + "ms");
        System.out.println("Total:" + (totalEnd - totalStart) / 1e6 + "ms");
        
        
        
    }
}
