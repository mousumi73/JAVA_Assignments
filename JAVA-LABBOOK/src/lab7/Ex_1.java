package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex_1 {
	static ArrayList<Integer> getValues(HashMap<String, Integer> hm){
		ArrayList<Integer> list=new ArrayList();
		for(Map.Entry<String, Integer> entry: hm.entrySet()) {
			list.add(entry.getValue());
		}
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("A",22);
		map.put("B",21);
		map.put("C",80);
		map.put("D",36);
		map.put("E",55);
		
		System.out.println(getValues(map));

	}

}
