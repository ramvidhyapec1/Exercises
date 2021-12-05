package collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// Queue is a data structure which works in first in first out Order (FIFO)
		Queue<String> peopleQueue = new ArrayDeque<String>();
		//add elements into queue
		peopleQueue.add("John");
		peopleQueue.add("Mike");
		peopleQueue.add("William");
		peopleQueue.add("Amar");
		peopleQueue.add("Jeet");
		peopleQueue.add("David");
		peopleQueue.add("Prama");
		peopleQueue.add("Prama");
		//to find the peak? or peek or top or head element
		System.out.println("Head : "+peopleQueue.peek());
		System.out.println("Head : "+peopleQueue.element());
		System.out.println("---------------------------------");
		
		//To get all the element
		//Data of insertion is preserved
		System.out.println(peopleQueue);
		System.out.println("---------------------------------");
		//remove and print head --> use poll()
		System.out.println("Removed element :"+peopleQueue.poll());
		System.out.println("Head now : "+peopleQueue.element());
		System.out.println("---------------------------------");
		
		//it is not thread safe
		//iterate over a queue
		for (String person :peopleQueue) {
			System.out.println("Name :"+person);
		}
		System.out.println("---------------------------------");
	}

}
