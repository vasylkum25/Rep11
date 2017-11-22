package kum.OOP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Case3 implements Case {
	
	private final  Scanner sc;

	   private final Map<Mentor, List<Group>> map;
	   
	   private final List<Auditory> auditories;
	   
	public Case3(Scanner sc, Map<Mentor, List<Group>> map, List<Auditory> auditories) {
		this.sc = sc;
		this.map = map;
		this.auditories = auditories;
	}



	@Override
	public boolean run() {
		if(!auditories.isEmpty()){
            System.out.println("Enter auditory: ");
            int auditoryNumber = sc.nextInt();
            Auditory auditory = new Auditory(auditoryNumber, new HashMap<>());
            System.out.println(auditories.get(auditoryNumber).getMap().isEmpty());
            System.out.println(auditories.contains(auditory));
            if(auditories.contains(auditory)&auditories.get(auditoryNumber).getMap().isEmpty()){
            System.out.println("Enter mentor name: ");
            String firstName = sc.next();
            System.out.println("Enter secondName: ");
            String secondName = sc.next();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            Mentor mentor = new Mentor(firstName, secondName, age);
            Map<Mentor, List<Group>> map1 = new HashMap<>();
            map1.put(mentor, map.get(mentor));
            auditory.setMap(map1);
            auditory.setAuditoryNumber(auditoryNumber);
            System.out.println("Auditory №" + auditory.getAuditoryNumber()+" ");
            System.out.println("Group №" + auditory.getMap().get(mentor).get(0).getGroupId());
            System.out.println(auditory.getMap());
            }
        }else{
            System.out.println("Auditory is not free");
            return true;
        }

		return true;
	}

}
