/*
 * This solution is only partially correct, some of the test cases are still failing
 */
public class Solution {

	public static void main(String[] arguments) {
		// The challenge has hidden code that runs on the server. This is a stub
	}
		// Class Node is on the Server
	    class Node {
	        int data;
	        Node left;
	        Node right;
	     }

	    boolean checkBST(Node node) {
	        
	        boolean isProper = true;
	        
	        if (node.left != null) {
	            isProper &= checkBSTLeft(node, node.left);            
	        }
	        
	        if (node.right != null) {
	            isProper &= checkBSTRight(node, node.right);
	        }
	        
	        return true;
	    }

	    boolean checkBSTLeft(Node parent, Node leftChild) {
	        boolean isProper = true;
	        
	        if (leftChild != null && leftChild.data < parent.data) {
	            //System.out.println(parent.data + " : " + leftChild.data);
	            isProper &= checkBST(leftChild);
	            
	        } else {
	            isProper = false;
	        }
	                    
	        return isProper;
	    }

	    boolean checkBSTRight(Node parent, Node rightChild) {
	        boolean isProper = true;
	        
	        if (rightChild != null && rightChild.data > parent.data) {
	            //System.out.println(parent.data + " : " + rightChild.data);
	            isProper &= checkBST(rightChild);
	            
	        } else {
	            isProper = false;
	        }
	        
	        return isProper;
	    }
	
}
