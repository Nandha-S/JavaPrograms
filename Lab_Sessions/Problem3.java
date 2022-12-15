package javaPrograms;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;

 class CountryMap {
	private HashMap<String, String> M1;
	
	public CountryMap() {
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<java.util.Map.Entry<String, String>> set = M1.entrySet();
		Iterator<java.util.Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKyeValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<java.util.Map.Entry<String, String>> set = M1.entrySet();
		Iterator<java.util.Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<java.util.Map.Entry<String, String>> set = M1.entrySet();
		Iterator<java.util.Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = (java.util.Map.Entry<String, String>) it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
}
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryMap countryMap = new CountryMap();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);

	}

}
