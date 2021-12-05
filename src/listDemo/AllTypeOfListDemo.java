package listDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class AllTypeOfListDemo {

	public static void main(String[] args) {
		// Array List
		List<String> listOfCompanies = new ArrayList<String>();
		// Use the superset List for the type of the variable so we can change between linkedlist or Vector or Stack later if needed
		listOfCompanies.add("DELL");
		listOfCompanies.add("SIMPLILEARN");
		listOfCompanies.add("DELL");
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("CGI");
		listOfCompanies.add("BOI");
		
		//print list
		System.out.println(listOfCompanies);
		//data is stored in the form of array
		//Allows duplicate of data
		//Non thread safe collection

		//Linked list
		List<String> listOfCities = new LinkedList<String>();
		listOfCities.add("New York");
		listOfCities.add("LA");
		listOfCities.add("Mumbai");
		listOfCities.add("California");
		listOfCities.add("Virginia");
		listOfCities.add("New York");
		listOfCities.add("Mumbai");
		
		//print list
		System.out.println(listOfCities);
		
		//data stored in the form of nodes
		//Allows duplicate of data
		//Non thread safe collection
		
		//Vector list -->Thread safe
				List<String> listOfFruits = new Vector<String>();
				listOfFruits.add("Orange");
				listOfFruits.add("Banana");
				listOfFruits.add("Mango");
				listOfFruits.add("Apple");
				listOfFruits.add("Kiwi");
				listOfFruits.add("Orange");
				listOfFruits.add("Grapes");
		
				//Print vector list
				System.out.println(listOfFruits);
		
		//Stack list -->Thread safe
				//First in last out order
				List<String> listOfBanks = new Stack<String>();
				listOfBanks.add("BOA");
				listOfBanks.add("BOI");
				listOfBanks.add("BOM");
				listOfBanks.add("BOC");
				listOfBanks.add("BOS");
				listOfBanks.add("BOA");
				
		
				//Print Stack list
				System.out.println(listOfBanks);
		
		
	}

}
