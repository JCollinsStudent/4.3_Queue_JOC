import java.util.Scanner;
public class Application {
	public static void main(String[] args) {
		Queue<String> myQueue = new Queue<String>();
		Scanner scan = new Scanner(System.in);
		boolean running = true;
		while (running) {

			System.out.println("Would you like to enqueue or dequeue?");
			String updateChoice = scan.nextLine();

			if (updateChoice.toLowerCase().equals("enqueue")) {
				System.out.println("Enter an item.");
				String itemToInsert = scan.nextLine();

				myQueue.enqueue(itemToInsert);
				System.out.println("Inserted " + itemToInsert +".");
				myQueue.printQueue();
			}
			else if (updateChoice.toLowerCase().equals("dequeue")) {
				String dequeuedItem = myQueue.dequeue();
				System.out.println("Dequeued item: " + dequeuedItem);
			}
			else {
				System.out.println("Invalid Command.");
			}

			System.out.println("Would you like to enter another command?");
			String restart = scan.nextLine();

			if (restart.toLowerCase() == "n" || restart.toLowerCase() == "no") {
				running = false;
			}
		}
		scan.close();
	}
}
