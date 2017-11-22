package kum.OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    	List<Auditory> auditorys = new ArrayList<>();
    	Map<Mentor, List<Group>> map = new HashMap<>();
		Map<String, Case> menu = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		menu.put("1", new Case1(sc, map));
		menu.put("2", new Case2(sc, map));
		menu.put("3", new Case3(sc, map, auditorys));
		menu.put("4", new Case4(sc, auditorys));
//		menu.put("5", new Case5(sc, map));
//		menu.put("6", new Case6( map));
		do{
			System.out.println("1. Create Mentor");
			System.out.println("2. Create Group and add to mentor");
			System.out.println("3. Reserv auditory");
			System.out.println("4. Delet  person");
			System.out.println("5. Delet  animal");
			System.out.println("6. Print Zoo Club");
		}while(menu.get(sc.next()).run());
	}
    }
