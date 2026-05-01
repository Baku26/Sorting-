import java.util.Random;

public class BinarySearchTree {
    
    class Node {
        int value;
        Node left, right;
        
        public Node(int item) {
            value = item;
            left = right = null;
        }
    }
    Node root;
    
    public void insert(int value) {
        root = insertRec(root, value);
        
    }
        private Node insertRec(Node root, int value) {
            if(root == null) {
                root = new Node(value);
                return root;
            }
            if(value < root.value) {
                root.left = insertRec(root.left, value);
                
                }
                else 
                root.right  = insertRec(root.right, value);
                return root;
                }
                public boolean contains(int value) {
                    return containsRec(root, value);
                
                }
                private boolean containsRec(Node root, int value) {
                    if(root == null) return false;
                    if(root.value == value) return true;
                    return value < root.value ? containsRec(root.left, value) : containsRec(root.right, value);
                    
                }
            }
        
    
