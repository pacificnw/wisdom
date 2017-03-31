import java.util.*;

public class Solution{
	
	public static int getHeight(Node root){
        
        return getTreeHeight(root, 0);
    }

    private static int getTreeHeight(Node root, int currentHeight) {
        
        int currentHeightLeft = currentHeight;
        int currentHeightRight = currentHeight;        
        
        if (root.left != null) {
            currentHeightLeft = getTreeHeight(root.left, currentHeight + 1);
        } 
        
        if (root.right != null) {
            currentHeightRight = getTreeHeight(root.right, currentHeight + 1);
        }        
        
        return currentHeightLeft > currentHeightRight ? currentHeightLeft : currentHeightRight;
    }
	
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int term = sc.nextInt();
	    Node root=null;
	    while(term-- > 0) {
	        int data = sc.nextInt();
	        root=insert(root,data);
	    }
	    
	    sc.close();
	    
	    int height=getHeight(root);
	    System.out.println(height);
	}    
}