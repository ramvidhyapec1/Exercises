package collections.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//TreeSet
		
		//In the output it will not consider the duplicate elements --> "NIKE"
		//Stores data in the ascending order
			TreeSet<String> setOfUniqueNames = new TreeSet<String>();
			setOfUniqueNames.add("John");
			setOfUniqueNames.add("Mike");
			setOfUniqueNames.add("William");
			setOfUniqueNames.add("Bob");
			setOfUniqueNames.add("John");
			setOfUniqueNames.add("Mark");
			//Print Set
			System.out.println(setOfUniqueNames);
			System.out.println(setOfUniqueNames.descendingSet());
			System.out.println("-------------------------------------");
			//Iterator 
			//Cannot use counter - because it cannot identify the element using index
//Enhanced for loop
			
			for (String name : setOfUniqueNames) {
				System.out.println(name);
			}
			System.out.println("-------------------------------------");
			for (String name : setOfUniqueNames.descendingSet()) {
				System.out.println(name);
			}
			System.out.println("-------------------------------------");


	}

}
