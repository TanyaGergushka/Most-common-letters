package mostPopularLetterInText;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoPopularLetter {
	
	static int sumOfValues = 0;

	public static void main(String[] args) {


		String text = "His name is Slim Shady";
		
		HashMap<Character, Integer> mapText = new HashMap<Character,Integer>();
		ValueComparator compareMap = new ValueComparator (mapText); 
		TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>(compareMap);
			

		
		for (int i = 0; i < text.length(); i++) {
			char ch = Character.toUpperCase(text.charAt(i));
		
			if (ch == ' '){
				continue;
			}
			if (mapText.containsKey(ch)){
				mapText.put(ch, mapText.get(ch) + 1);
				
			} else {
				mapText.put(ch, 1);
				
			}
	}
		
		
	
		treeMap.putAll(mapText);
	
		
		printMap(mapText);
		printMap(treeMap);
	
		
	}
	
public static void sumOfValue (Map<Character, Integer> map){
	for (Entry<Character, Integer> entry : map.entrySet()){
		sumOfValues += entry.getValue();
		
		}
		
		
		}


	public static void printMap (Map<Character, Integer> map){
		
		sumOfValue(map);
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    System.out.println( entry.getKey() + ": " + entry.getValue()+ " " + percent(entry.getValue()));
		}
		}

	
	public static String percent (int value){
		
		
		int part = 0 ;
		String symbol = "*";
		String text = "";
		String result = "";
	
		
		
		part = 100 / sumOfValues;
		for (int i = 0; i < part; i++) {
			text += symbol;
		}
		
	
		
			for (int i = 0; i < value; i++) {
				result += text;
			}
			
		
		return result;
		
	}
	}

	

	
	

