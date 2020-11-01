package basic.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Mohd", "Helmi", 12.67f, 25);
		Student s2 = new Student(2, "Momo", "Hauo", 2.67f, 24);
		Student s3 = new Student(3, "Mimi", "Pop", 13.67f, 21);
		Student s4 = new Student(4, "Mas", "Lop", 1.67f, 5);
		
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		
		Collections.sort(sList);
		System.out.println("-----After Sorting-----");
		
		for(Student stu : sList) {
			System.out.println(stu);
		}
	}

}
