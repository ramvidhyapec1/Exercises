package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// Queue is a data structure which works in first in first out Order (FIFO)
		//PriotiyQuee  does nto mains the FIFO order 
		//elements are maintained based on the priority of the elements
		Queue<String> banKQueue = new PriorityQueue<>();
		//add elements into queue
				banKQueue.add("John");
		banKQueue.add("Smith");
		banKQueue.add("William");
		banKQueue.add("Parul");
		banKQueue.add("Jeet");
		banKQueue.add("Mike");
		banKQueue.add("Prama");
		banKQueue.add("Prama");
		
		//To get all the element
				//Here it is received based on the Heap memory reference
				System.out.println(banKQueue);
				System.out.println("---------------------------------");
		
		//to find the peak? or peek or top or head element
		System.out.println("Head : "+banKQueue.peek());
		System.out.println("Head : "+banKQueue.element());
		System.out.println("---------------------------------");
		
		//To get all the element
		//Data of insertion is preserved
		System.out.println(banKQueue);
		System.out.println("---------------------------------");
		//remove and print head --> use poll()
		System.out.println("Removed element :"+banKQueue.poll());
		System.out.println("Head now : "+banKQueue.element());
		System.out.println("---------------------------------");
		
		//it is not thread safe
		//iterate over a queue
		for (String person :banKQueue) {
			System.out.println("Name :"+person);
		}
		System.out.println("---------------------------------");
		
	}

}
