package com.simplilearn.mycollections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Long> phonebook = new HashMap<>();
		
		//add elements into map
		phonebook.put("John", 8998889898L);
		phonebook.put("Mike", 8976589898L);
		phonebook.put("Ava", 8830159898L);
		phonebook.put("Emma", 89926539898L);
		phonebook.put("Marry", 8998777898L);
		phonebook.put("John", 8998344898L);
		System.out.println(phonebook);
		System.out.println("----------------------");
		
		//To fetch values from map
		System.out.println("Ava number :"+phonebook.get("Ava"));
		System.out.println("----------------------");
		System.out.println("Mike's number :"+phonebook.get("Mike"));
		System.out.println("----------------------");
		System.out.println("Mike's number :"+phonebook.get("Make")); //When given an incorrect key
		System.out.println("----------------------");
		
		//Iteration
		for (Map.Entry<String, Long> entry : phonebook.entrySet()) {
			System.out.println(("Key : "+entry.getKey()));
			System.out.println(("Value : "+entry.getValue()));
			System.out.println("----------------------");
		}
		
		
	}

}
