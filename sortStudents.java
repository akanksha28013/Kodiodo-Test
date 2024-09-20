package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortStudents {
	
	public static void main(String[] args) {
        
		ArrayList<Student> studentList = new ArrayList<>();
        
        studentList.add(new Student(1, "Akanksha", 88));
        studentList.add(new Student(2, "Onkar", 89));
        studentList.add(new Student(3, "Dhanashri", 75));
        
         Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.marks - s1.marks; 
            }
        });

        for (Student student : studentList) {
            System.out.println(student.name + " - Marks: " + student.marks);
        }
	}
}
