import java.util.*;

public class Solution {
	
    static void levelOrder(Node root){

        ArrayList<Node> nodesAtNextLevel = new ArrayList<Node>();
        nodesAtNextLevel.add(root);
        System.out.print(root.data);
        treeLevelTraversal(nodesAtNextLevel);
    }

    private static void treeLevelTraversal(ArrayList<Node> nodesAtLevel) {
        
        ArrayList<Node> nodesAtNextLevel = new ArrayList<Node>();
        
        for (Node node : nodesAtLevel) {
            if (node.left != null) {
                System.out.print(" " + node.left.data);
                nodesAtNextLevel.add(node.left);    
            }
            
            if (node.right != null) { 
                System.out.print(" " + node.right.data);
                nodesAtNextLevel.add(node.right);
            }
        }
        
        if (nodesAtNextLevel.size() > 0) {
            treeLevelTraversal(nodesAtNextLevel);
        }
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
    
    public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    Node root=null;
	    while(T-->0){
	        int data=sc.nextInt();
	        root=insert(root,data);
	    }
	    sc.close();
	    levelOrder(root);
    }	
}