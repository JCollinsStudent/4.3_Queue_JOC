
/**
 * The Node class describes an item to be added to the linkedList. It contains instance variables for only the data and nextNode.
 * @author njohnson3 (modified by Joshua Collins)
 * @version 2.0
 * @since 2021-08-25
 */
class Node<T> {
	T data;

	Node nextNode;
	public Node()
	{
		nextNode=null;
	}
	public void setData(T data) {
		this.data=data;
	}
	public Node getNode() {
		return this;
	}
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}
	
	
}
