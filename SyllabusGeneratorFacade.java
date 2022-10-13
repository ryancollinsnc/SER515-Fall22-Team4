import java.util.*;
public class SyllabusGeneratorFacade {

	private int UserType;

	private Course theSelectedCourse;

	private ClassCourseList theCourseList;

	public Syllabus createSyllabus() {
		Scanner op = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		String details, content;
		Creator sylc;
		System.out.println("\nEnter Option:\n1) CS Syllabus\n2) SE Syllabus");
		int opt = inp.nextInt();
		switch (opt) {
			case 1:
				System.out.println("\nEnter course details:");
				details = op.nextLine();
				System.out.println("\nEnter course content:");
				content = op.nextLine();
				SyllabusPatternOne newsyl_one = new SyllabusPatternOne(details, content, "These are uni policies");
				sylc = new Creator(newsyl_one);
				sylc.createSyllabus();
				newsyl_one.displaySyllabus();
				return sylc.getSyllabus();
			case 2:
				System.out.println("\nEnter course details:");
				details = op.nextLine();
				System.out.println("\nEnter course content:");
				content = op.nextLine();
				SyllabusPatternTwo newsyl_two = new SyllabusPatternTwo(details, content, "These are uni policies");
				sylc = new Creator(newsyl_two);
				sylc.createSyllabus();
				newsyl_two.displaySyllabus();
				return sylc.getSyllabus();
		}
		return new Syllabus();
	}

	public Syllabus getOldSyllabus() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\nEnter Option:\n1) 2021 SE Syllabus");
		int opt = inp.nextInt();
		AddSyllabusModules syl_old = new AddSyllabusModules(new Syllabus());
		syl_old.setDetails("");
		syl_old.setContent("");
		syl_old.setPolicies("");
		syl_old.display();
		return syl_old.getSyllabus();
	}

	public void publishSyllabus(Syllabus s) {
		PublishSyllabusCanvas pub = new Canvas();
		PublishSyllabusService adapt = new PublishAdapter(pub);
		adapt.publishService(s);
	}

	public void timer(){
		Timer time = new Timer();
		time.timerFunc();
	}
}
