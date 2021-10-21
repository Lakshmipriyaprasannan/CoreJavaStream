package task.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CoreJavaStream {
	public static void main(String [] args) {
		
		// 1. Add to the ArrayList:
		String [] elements= {"d1","f4","a3","b7","b2","x4","l2","f3",
				            "f1","a1","c2","b2","a4","b8","b1","a3","b9","l4","b9","h2"};
		List<String> list=new ArrayList<String> (Arrays.asList(elements));
		System.out.println("ArrayList of string : " +list);
		
		//2. Stream Filter All Elemnts Start With "b":
		List<String> result= list.stream().filter(el ->el.startsWith("b")).collect(Collectors.toList());
		System.out.println("Elements start with b : "+result);
		
		//3. Find the unique elements from filtered result using Hashset:
		HashSet<String> set = new HashSet<String>(result);
		System.out.println("Unique elements using hashset : "+set);
		
		//4. Add the unique elements from Hashset to Hashmap:
		Map<Integer, String> map=new HashMap<Integer, String>();
		for(String string:set){
			String s=string.substring(1);
			int integer= Integer.parseInt(s);
			map.put(integer, string);
		}
		//5. print all elements in hashmap:
		System.out.println("HashMap Elements : "+map);	
	}
}


