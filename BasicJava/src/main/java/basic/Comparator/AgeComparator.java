package basic.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		if(s1.getAge().compareTo(s2.getAge()) == 0) {
			return 0;
		}else if(s1.getAge().compareTo(s2.getAge()) < 0) {
			return -1;
		}else if(s1.getAge().compareTo(s2.getAge()) > 0) {
			return 1;
		}
		return 0;
	}

}
