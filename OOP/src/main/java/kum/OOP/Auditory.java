package kum.OOP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Auditory {

    private int auditoryNumber;

    private Map<Mentor, List<Group>> map = new HashMap<>();
    
    

	public Auditory() {
	}

	public void setAuditoryNumber(int auditoryNumber) {
		this.auditoryNumber = auditoryNumber;
	}

	public void setMap(Map<Mentor, List<Group>> map) {
		this.map = map;
	}

	public Auditory(int auditoryNumber, Map<Mentor, List<Group>> map) {
		this.auditoryNumber = auditoryNumber;
		this.map = map;
	}

	public int getAuditoryNumber() {
		return auditoryNumber;
	}

	public Map<Mentor, List<Group>> getMap() {
		return map;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + auditoryNumber;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
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
		Auditory other = (Auditory) obj;
		if (auditoryNumber != other.auditoryNumber)
			return false;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Auditory [auditoryNumber=" + auditoryNumber + ", map=" + map + "]";
	}

   

}