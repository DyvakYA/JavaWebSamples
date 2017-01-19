package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomHashMap<String, Integer> testMap = new CustomHashMap<>();
        System.out.println(testMap.put("1",1));
        System.out.println(testMap.put("2",2));
        System.out.println(testMap.put("3",3));
        System.out.println("get");
        System.out.println(testMap.get("1"));
        System.out.println(testMap.get("2"));
        System.out.println(testMap.get("3"));
        System.out.println("remove");
        System.out.println(testMap.remove("1"));
        System.out.println(testMap.get("1"));
    }
}
