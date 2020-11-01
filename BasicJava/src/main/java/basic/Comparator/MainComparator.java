package basic.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparator {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		
		sList.add(new Student(1, "Mohd", "Helmi", 12.67f, 25));
		sList.add(new Student(2, "Momo", "Hauo", 2.67f, 24));
		sList.add(new Student(3, "Mimi", "Pop", 13.67f, 21));
		sList.add(new Student(4, "Mas", "Lop", 1.67f, 5));
		
		Collections.sort(sList, new IdComparator());
		printStudent(sList, "Id");
		
		Collections.sort(sList, new AgeComparator());
		printStudent(sList, "Age");
		
		Collections.sort(sList, new ScoreComparator());
		printStudent(sList, "Score");
	}
	
	
	
	
	private static void printStudent(List<Student> sList, String comp) {
		System.out.println("-------Sort by "+comp+"-------");
		for(Student stu : sList) {
			System.out.println(stu);
		}
		System.out.println();
	}

}
