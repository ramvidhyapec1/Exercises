package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
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
	}

}
