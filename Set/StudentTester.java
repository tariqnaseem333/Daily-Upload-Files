package wednesday_06_dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentTester {

	public static void main(String[] args) {

		Student student1 = new Student("Ron", 1, 101);
		Student student2 = new Student("Angela", 9, 102);
		Student student3 = new Student("Hazel", 5, 103);
		Student student4 = new Student("David", 3, 104);
		Student student5 = new Student("Alan", 4, 105);
		Student student6 = new Student("Hazel", 5, 103);
		Student student7 = new Student("Ron", 1, 101);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);

//		Displaying Unique Students who have applied for Re-evaluation
		Set<Student> studentSet = new TreeSet<Student>(studentList);
		Iterator<Student> iterator = studentSet.iterator();
		System.out.println("List of students who applied for re-evaluation: ");
		while( iterator.hasNext() ) {
			iterator.next().displayDetails();
		}
		
//		List of students who applied for re-evaluation in more than one subject:
//			 
//			Name: Hazel 
//			Name: Ron
		
		
//		Displaying Students who applied for re-evaluation in more than one subject:
		System.out.println();
		System.out.println("List of student name who applied for re-evaluation in more than one subject: ");
		Collections.sort(studentList);
		for( int i = 0; i < studentList.size() - 1; i++ ) {
			if( studentList.get(i).getStudentId().equals(studentList.get(i+1).getStudentId()) ) {
				System.out.println("Name: " + studentList.get(i).getStudentName());
			}
		}
		
	}

}
