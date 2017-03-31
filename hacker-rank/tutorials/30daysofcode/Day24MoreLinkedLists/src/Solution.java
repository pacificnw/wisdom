import java.util.*;
public class Solution {
	
    public static Node removeDuplicates(Node node) {

        node = removeDuplicateNodes(node, node.next);
        
        return node;
    }

    public static Node removeDuplicateNodes(Node priorNode, Node currentNode) {
        
        if (currentNode != null) {
            
            if (currentNode.data == priorNode.data) {
                priorNode.next = currentNode.next;
                removeDuplicateNodes(priorNode, priorNode.next);
            } else { 
                removeDuplicateNodes(currentNode, currentNode.next);
            }
        }
        
        return priorNode;
    }
	
	public static  Node insert(Node head,int data)
	{
	    Node p = new Node(data);			
	    if(head == null)
	        head = p;
	    else if(head.next == null)
	        head.next = p;
	    else
	    {
	        Node start = head;
	        while (start.next != null)
	            start = start.next;
	        start.next = p;
	
	    }
	    
	    return head;
	}

	public static void display(Node head)
	{
		Node start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
	}

	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while(T-- > 0){
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		sc.close();
		head = removeDuplicates(head);
		display(head);
   }
}
