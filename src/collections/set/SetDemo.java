package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// Set is child interface in Collection
		//Set does not store duplicate values
		//Implementation class : HashSet, LinkedHashSet, TreeSet
		//Divided into different class
		
		//Set declaration
		Set<String> set1=new HashSet<String>();//When you do not want any insertion order to be preserved but the elements are unique
		Set<String> set2=new LinkedHashSet<String>(); // when you want to preserve te insertion order
		Set<String> set3=new TreeSet<String>(); //When you want to arrange the elements in ascending or decending order
		
		//HashSet
		
		//In the output it will not consider the duplicate elements --> "DELL"
		//Stores data in the form of HASH values and the memory reference will be given, so the order of insertion is not preserved
		Set<String> setOfUniqueCompanies = new HashSet<String>();
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("SIMPLILEARN");
		setOfUniqueCompanies.add("CISCO");
		setOfUniqueCompanies.add("WIPRO");
		setOfUniqueCompanies.add("DELL");
		
		//Print Set
		System.out.println(setOfUniqueCompanies);
		
		
		//Enhanced for loop
		for (String brand : setOfUniqueCompanies) {
			System.out.println(brand);
		}
		System.out.println("-------------------------------------");
		
		//LinkedHashSet
		
				//In the output it will not consider the duplicate elements --> "NIKE"
				//Stores data in the inserted order
				Set<String> setOfUniqueBrands = new LinkedHashSet<String>();
				setOfUniqueBrands.add("Nike");
				setOfUniqueBrands.add("Fila");
				setOfUniqueBrands.add("ASICS");
				setOfUniqueBrands.add("Adidas");
				setOfUniqueBrands.add("Nike");
				setOfUniqueBrands.add("Puma");
				//Print Set
				System.out.println(setOfUniqueBrands);
				System.out.println("-------------------------------------");
				
		//Enhanced for loop
				
				for (String company : setOfUniqueBrands) {
					System.out.println(company);
				}
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
