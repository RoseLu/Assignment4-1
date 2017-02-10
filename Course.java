import java.util.ArrayList;

public class Course {
	private String name;
	private int numberOfStudent;
	private ArrayList<Student> students;
	
	public Course(String title) {
		name = title;
		this.students = new ArrayList<Student>();
	}
	
	public ArrayList<Student> getStudent() {
		return students;
	}
	
	public boolean isFull() {
		return numberOfStudent >= 10;
	}
	
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	
	public String getTitle() {
		return name;
	}
	
	public boolean registerStudent(Student student) {
		if(isFull()) return false;
		students.add(student);
		numberOfStudent++;
		return true;
	}
}
