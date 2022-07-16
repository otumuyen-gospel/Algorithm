
import java.util.*;

public class Executable {
    
    public static void main(String[] args) {
        BST t = new BST();
        t.insert('C');
        t.insert('I');
        t.insert('B');
        t.insert('G');
        t.insert('M');
        t.insert('A');
        t.preorderTraversal(t.root);
    }
    
}
