/**
 * The linkedList class stores a list of nodes. This class offers the functionality
 * to return whether or not the list is empty, return the head of the list, and add a node
 * to the list. A main method to test the linked list is included.
 * 
 * @author njohnson3 (modified by Joshua Collins)
 * @version 2.0
 * @since 2021-08-25
 */

public class LinkedList {
	

	Node head;
	int length;
	Node tail;
	
	/**
	 * The constructor for linkedList, instantiates a new empty list.
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	
	/**
	 * The isEmpty method is a check for an empty list.
	 * @return boolean whether the list is empty.
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	
	/**
	 * The getList method is a getter for the head of the list.
	 * @return Node The head of the list.
	 */
	public Node getList()
	{
		return head;
	}
	
	/**
	 * The addNode method is used to add a node to the linked list.
	 * @param aNode The node to be added.
	 */
	public void addNode(Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}

	/**
	 * This main method is used to test the linked list.
	 * @param args Terminal arguments (unused).
	 */
	public static void main(String[] args) {
		LinkedList myList=new LinkedList();
		
		Node<Integer> aNode=new Node<Integer>();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node<Integer>();
		aNode.setData(2);
		myList.addNode(aNode);
		
		Node<String> anotherNode = new Node<String>();
		anotherNode.setData("This is a generic linked list");
		myList.addNode(anotherNode);
		
		Node<Boolean> boolNode = new Node<Boolean>();
		boolNode.setData(true);
		myList.addNode(boolNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		
	}

}
