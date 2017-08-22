package mostPopularLetterInText;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Character> {

	Map<Character,Integer> map;
	
	public ValueComparator(Map<Character, Integer> map) {
		this.map = map;
	}

	@Override
	public int compare(Character o1, Character o2) {
		if (map.get(o1) >= map.get(o2)){
			return -1;
		}
		return 1;
		
	}

}