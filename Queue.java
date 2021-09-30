/**
 * The Queue class contains the functionality to create a new LinkedList of generic type,
 * enqueue or dequeue items, and print the queue.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-09-29
 */
public class Queue<T> {
	// The list containing the items to be enqueued or dequeued.
	private LinkedList<T> queueList;

	/**
	 * The default constructor. Assigns a new LinkedList of generic type to queueList. 
	 */
	public Queue() {
		this.queueList = new LinkedList<T>();
	}

	/**
	 * The method containing the logic to enqueue an item.
	 * 
	 * @param newItem The item to be enqueued.
	 */
	public void enqueue(T newItem) {
		Node<T> currentItem = queueList.getList();
		Node<T> newNode = new Node<T>();
		newNode.setData(newItem);
		newNode.nextNode = null;
		if (queueList.length == 0) {
			queueList.addNode(newNode);
			queueList.length++;
		}
		else {
			for (int i=0; i < queueList.length; i++) { 
				if (currentItem.nextNode != null) {
					if (queueList.length !=0) {
						currentItem = currentItem.nextNode;
					}
				}
				else {
					currentItem.nextNode = newNode;
					queueList.length++;
				}
			}
		}
	}

	/**
	 * The method containing the logic to dequeue an item.
	 * 
	 * @return The head of the list after dequeuing the item.
	 */
	public T dequeue() {
		Node<T> head = queueList.getList();
		if (queueList.length != 0) {
			queueList.head = head.nextNode;
			queueList.length--;
			return head.data;
		} else {
			return null;
		}
	}

	/**
	 * The method containing the logic to print the items in the queue.
	 */
	public void printQueue() {
		if (queueList.length != 0) {
			Node<T> currentItem = queueList.getList();
			while (currentItem != null) {
				System.out.println(currentItem.data);
				currentItem = currentItem.nextNode;
			}
		}
	}

	/**
	 * The getter for the queueList.
	 * 
	 * @return queueList
	 */
	public LinkedList<T> getQueue() {
		return this.queueList;
	}
}
