package basics;

public class Student {
	//static variables are created in class area
	//objects[boxes] are created in heap area
	public static String COLLEGE_NAME = "IIT";  // not one partition of Student (debug)
	int age;			// partition 1
	String name;		// partition 2
	
	/*
	 * default constructor
	 */
	public Student() {
		System.out.println("default constructor called");
	}
	
	public Student(int mage, String mname) {
		this();
		System.out.println("parameterized constructor called");
		this.age = mage;
		this.name= mname;	// this.age is a partition of the box
	}
	
	public static void display() {
		System.out.println("this method can be called without creating the object of the Student ");
	}
	
	public static void main(String[] args) {
		Student abdul = new Student(123, "ansari");
		
		System.out.println(abdul.name);
		System.out.println(Student.COLLEGE_NAME);
	}
}
