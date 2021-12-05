package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
public static void main(String[] args) {
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
}
}
