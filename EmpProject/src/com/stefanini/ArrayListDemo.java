package com.stefanini;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("sagar","praful","ajay","vishal","gopal");
		
		for(String s :asList) {
			System.out.println(s);
		}

	}

}
