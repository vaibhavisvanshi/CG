package collections;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 1  Develop a java class with a instance variable Country HashSet (H1)
 add a method saveCountryNames(String CountryName) ,
 the method should add the passed country to a HashSet (H1) 
 and return the added HashSet(H1). 
 Develop a method getCountry(String CountryName) which iterates through the HashSet 
 and returns the country if exist else return null.
 NOTE: You can test the methods using a main method.
 * 
 * 
 * */
class Country {

	private HashSet<String> H1;

	public Country() {
		H1 = new HashSet<>();
	}

	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}

	public String getCountry(String CountryName) {
		Iterator<String> itr = H1.iterator();
		while (itr.hasNext()) {

			if (itr.next().equals(CountryName)) {
				return CountryName;
			}

		}
		return null;
	}
}

public class CountryHashSet {

	public static void main(String[] args) {

		Country c = new Country();
		c.saveCountryNames("India");
		c.saveCountryNames("Mexico");
		c.saveCountryNames("California");
		c.saveCountryNames("Japan");
		c.saveCountryNames("Korea");

		System.out.println("California: " + c.getCountry("California"));
		System.out.println("London: " + c.getCountry("London"));

	}

}
