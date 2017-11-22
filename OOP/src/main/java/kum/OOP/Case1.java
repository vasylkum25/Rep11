package kum.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Case1 implements Case{

   private final  Scanner sc;

   private final Map<Mentor, List<Group>> map;

	public Case1(Scanner sc, Map<Mentor, List<Group>> map) {
	this.sc = sc;
	this.map = map;
}

	@Override
	public boolean run() {
         System.out.println("Enter name: ");
         String firstName = sc.next();
         System.out.println("Enter secondName: ");
         String secondName = sc.next();
         System.out.println("Enter age: ");
         int age = sc.nextInt();
         Mentor mentor = new Mentor(firstName, secondName, age);
         if(!map.containsKey(mentor)){
        	 map.put(mentor, new ArrayList<>());
         }
         System.out.println(map);
     return true;
		
	}
}
