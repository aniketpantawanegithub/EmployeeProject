package com.stefanini;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "sahil");
		map.put(102, "azim");
		map.put(103, "mangesh");
		map.put(104, "abhishek");
		
		
		Set<Integer> keySet = map.keySet();
		for(Integer i : keySet) {
			System.out.println(i);
			System.out.println(map.get(i));
		}
		

	}

}
