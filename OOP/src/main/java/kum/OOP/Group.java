package kum.OOP;


import java.util.List;

public class Group {

private List<Student> students;

private int groupId;

    public Group( List<Student> students, int groupId) {
        this.students = students;
        this.groupId = groupId;
    }

    public Group(List<Student> students) {

    }
    public Group() {

    }

    public  List<Student> getStudents() {
        return students;
    }

    public void setStudents( List<Student> students) {
        this.students = students;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupId;
		result = prime * result + ((students == null) ? 0 : students.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (groupId != other.groupId)
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}

	public void printGroup(){
        for (Student student : students){
            System.out.println(student.getFirstName()+" "+student.getSecondName());
        }
    }

	@Override
	public String toString() {
		return "Group [students=" + students + ", groupId=" + groupId + "]";
	}
    

}
