package basic.Comparator;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		if(s1.getScore().compareTo(s2.getScore()) == 0) {
			return 0;
		}else if(s1.getScore().compareTo(s2.getScore()) < 0) {
			return -1;
		}else if(s1.getScore().compareTo(s2.getScore()) > 0) {
			return 1;
		}
		return 0;
	}

}
