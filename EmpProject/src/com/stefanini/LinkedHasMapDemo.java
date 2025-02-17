package com.stefanini;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHasMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Pune");
		map.put(102, "nagpur");
		map.put(103, "Akola");
		map.put(104, "Amravati");

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
		Integer i = itr.next();
			System.out.println("keys :"+i);
			System.out.println("values :"+map.get(i));
		}

	}

}
