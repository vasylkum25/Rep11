package kum.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Case2 implements Case{
	
	private final  Scanner sc;

	private final Map<Mentor, List<Group>> map;
	
	public Case2(Scanner sc, Map<Mentor, List<Group>> map) {
		this.sc = sc;
		this.map = map;
	}



	@Override
	public boolean run() {
		 List<Student> studentList = new ArrayList<>();
	        boolean isRun = true;
	        System.out.println("Enter group id");
	        int groupID = sc.nextInt();
	        System.out.println("Enter name mentor how you whont add group: ");
	        String mentorName = sc.next();
	        System.out.println("Enter secondName mentor how you whont add group: ");
	        String mentorSecondName = sc.next();
	        System.out.println("Enter age mentor how you whont add group: ");
	        int ageMentor = sc.nextInt();
	        Mentor mentor = new Mentor(mentorName, mentorSecondName, ageMentor);
	        System.out.println("Add student:");
	        while (isRun) {
	            System.out.println("Enter name: ");
	            String firstName = sc.next();
	            System.out.println("Enter secondName: ");
	            String secondName = sc.next();
	            System.out.println("Enter age: ");
	            int age = sc.nextInt();
	            studentList.add(new Student(firstName, secondName, age, groupID));
	            System.out.println("You whon to add one more student y/n?");
	            String ansver = sc.next();
	            if (ansver.equals("n")) {
	                isRun = false;
	            }
	        }
	        Group group = new Group(studentList, groupID);
	        map.get(mentor).add(group);
	        System.out.println(map);
		return true;
	}

}
