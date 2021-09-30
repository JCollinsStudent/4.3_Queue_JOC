import java.util.Scanner;

/**
 * The Application class handles user input to enqueue or dequeue an item.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-09-29
 */
public class Application {
	/**
	 * The main method containing the loop to instantiate a new queue and allow
	 * the user to enqueue or dequeue items.
	 */
	public static void main(String[] args) {
		Queue<String> myQueue = new Queue<String>();
		Scanner scan = new Scanner(System.in);
		boolean running = true;
		while (running) {

			System.out.println("Would you like to enqueue or dequeue?");
			String updateChoice = scan.nextLine();

			if (updateChoice.toLowerCase().equals("enqueue")) {
				System.out.println("\nEnter an item.");
				String itemToInsert = scan.nextLine();

				myQueue.enqueue(itemToInsert);
				System.out.println("\nInserted " + itemToInsert +".\n\nCurrent Items:");
				myQueue.printQueue();
				System.out.println();
			}
			else if (updateChoice.toLowerCase().equals("dequeue")) {
				String dequeuedItem = myQueue.dequeue();
				System.out.println("Dequeued item: " + dequeuedItem);
			}
			else {
				System.out.println("Invalid Command.");
			}

			boolean exiting = true;
			while (exiting) {
				System.out.println("Would you like to enter another command?");
				String restart = scan.nextLine();

				if (restart.toLowerCase().equals("n") || restart.toLowerCase().equals("no")) {
					running = false;
					exiting = false;
				}
				else if (restart.toLowerCase().equals("y") || restart.toLowerCase().equals("yes")) {
					exiting = false;
				}
				else {
					System.out.println("Invalid Command.");
				}
			}
		}
		scan.close();
	}
}
