import java.util.*;
public class SyllabusGeneratorFacade {

	private int UserType;

	private Course theSelectedCourse;

	private ClassCourseList theCourseList;

	public Syllabus createSyllabus() {
		Syllabus s = new Syllabus("hi", "hello", "when");
		return s;
	}

	public void addSyllabusModule() {

	}

	public void modifySyllabus(Syllabus syllabus) {

	}

	public void addPolicy() {

	}

	public void selectCourse() {

	}

	public void attachCourseToUser() {

	}

	public static void main(String[] args) {
		int opt = menu();
		int ins_opt=0;
		if(opt==1){
			ins_opt = instructorMenu();
		}
		System.out.println(opt + " "+ ins_opt);
	}

	public static int menu(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Role:\t1)Course Instructor\t2) Program Chair");
		int opt = inp.nextInt();
		return opt;
	}

	public static int instructorMenu(){
		Scanner inp = new Scanner(System.in);
		System.out.println("\nEnter Option:\n1)Create New Syllabus\n2) Create from Existing Syllabus\n3)Publish Syllabus");
		int opt = inp.nextInt();
		return opt;
	}

}
