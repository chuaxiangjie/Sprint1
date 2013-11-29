import java.util.ArrayList;

public class Assignment {

	private String grade1;
	private String grade2;
	private Student student;
	
	public static ArrayList<Assignment> aList = new ArrayList<Assignment>();
	
	public static void popAssignment() {
		Assignment a1 = new Assignment("B", "A", Student.studList.get(0));
		Assignment a2 = new Assignment("A", "B", Student.studList.get(1));
		Assignment a3 = new Assignment("E", "C", Student.studList.get(2));
		Assignment a4 = new Assignment("H", "D", Student.studList.get(3));
		Assignment a5 = new Assignment("D", "C", Student.studList.get(4));
		aList.add(a1);
		aList.add(a2);
		aList.add(a3);
		aList.add(a4);
		aList.add(a5);

	}
	
	public Assignment(String grade1, String grade2, Student student) {
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.student = student;
	}
	public String getGrade1() {
		return grade1;
	}
	public void setGrade1(String grade1) {
		this.grade1 = grade1;
	}
	public String getGrade2() {
		return grade2;
	}
	public void setGrade2(String grade2) {
		this.grade2 = grade2;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
