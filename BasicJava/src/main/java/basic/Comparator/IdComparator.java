package basic.Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{
	
	/**
	 * Cast the Obj type to Student since not use Generic type
	 * Comparator
	 */
	public int compare(Student s1, Student s2) {
		if(s1.getId().compareTo(s2.getId()) == 0) {
			return 0;
		}else if(s1.getId().compareTo(s2.getId()) > 0) {
			return -1;
		}else if(s1.getId().compareTo(s2.getId()) < 0) {
			return 1;
		}
		return 0;
	}

}
