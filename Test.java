import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Course math = new Course("Math");
		assertTrue(math.getTitle().equals("Math"));
		for(int i = 0; i < 9; i++) {
			Student s = new Student(Math.random() * 100 + "-" + i, "student" + i);
			math.registerStudent(s);
		}
		assertTrue(math.getNumberOfStudent() == 9);
		assertFalse(math.isFull());
		
		
		Student s = new Student(Math.random() * 100 + "-" + 10, "student" + 10);
		math.registerStudent(s);
		
		assertTrue(math.getNumberOfStudent() == 10);
		assertTrue(math.isFull());
		
		Student s2 = new Student(Math.random() * 100 + "-" + 10, "student" + 10);
		assertFalse(math.registerStudent(s2));
	}

}
