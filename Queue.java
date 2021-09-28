public class Queue<T> {
	private LinkedList queueList;

	public Queue() {
		this.queueList = new LinkedList();
	}

	public void enqueue(T newItem) {
		System.out.println("In enqueue");
		Node currentItem = queueList.getList();
		if (queueList.length == 0) {
			
			System.out.println("in empty list enqueue");
			Node newNode = new Node<T>();
			newNode.setData(newItem);
			queueList.addNode(newNode);
			System.out.println("after addNode()");
		}
		for (int i=0; i < queueList.length; i++) { 
			if (currentItem.nextNode != null) {
				if (queueList.length !=0) {
					System.out.println(currentItem.data);
					currentItem = currentItem.nextNode;
					//currentItem.nextNode.setData(newItem);
				}
			}
			else {
				currentItem = currentItem.nextNode;
			}
		}
	}

	public T dequeue() {
		Node head = queueList.getList();
		if (head.nextNode != null) {
			queueList.head = head.nextNode;
		}

		return (T) head.data;
	}

	public void printQueue() {
		if (queueList.length != 0) {
			Node currentItem = queueList.getList();
			while (currentItem != null) {
				System.out.println(currentItem.data);
				currentItem = currentItem.nextNode;
			}
			//System.out.println("currentItem.data = " + currentItem.data);
			//for (int i=0; i<queueList.length; i++) {
			//	System.out.println(currentItem.data);
			//	if (currentItem.nextNode != null) {
			//		currentItem = currentItem.nextNode;
			//	}
			//}
		}
		else {
			System.out.println("length is 0");
		}


	}

	public LinkedList getQueue() {
		return this.queueList;
	}
}
