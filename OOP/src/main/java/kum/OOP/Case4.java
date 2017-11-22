package kum.OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Case4 implements Case{
	
	private final  Scanner sc;
	
	private final List<Auditory> auditories;

	public Case4(Scanner sc, List<Auditory> auditories) {
		this.sc = sc;
		this.auditories = auditories;
	}

	@Override
	public boolean run() {
		 System.out.println("Enter auditory: ");
         int auditoryNumber = sc.nextInt();
         Auditory auditory = new Auditory(auditoryNumber, new HashMap<>());
         if(!auditories.contains(auditory)){
         auditories.add(auditory);
         }else{
        	 System.out.println("Auditory reserved");
         }
         System.out.println(auditories);
     return true;
	}
	
	

}
