import java.util.*;

public class AddSyllabusModules extends CreateSyllabusDecorator {

	protected AddSyllabusModules(CreateSyllabus decoratedSyllabus) {
		super(decoratedSyllabus);
	}

	private void setOldSyllabusDetails() {
		decoratedSyllabus.setDetails("Old Syllabus Details");
	}

	private void setOldSyllabusContent() {
		decoratedSyllabus.setContent("Old Syllabus Details");
	}

	private void setOldSyllabusPolicy() {
		decoratedSyllabus.setPolicies("Old Syllabus Policy");
	}

	public void setDetails(String details) {
		setOldSyllabusDetails();
	}

	public void setContent(String content) {
		setOldSyllabusContent();
	}

	public void setPolicies(String policies) {
		setOldSyllabusPolicy();
	}
	/*public String getDetails() {return decoratedSyllabus.getContent();}
	public String getContent() {return decoratedSyllabus.getContent();}
	public String getPolicies() {return decoratedSyllabus.getContent();}*/
	public void display(){
		System.out.println("Old Syllabus for SE2021");
		System.out.println("\nCourse Details:\n" + decoratedSyllabus.getDetails());
		System.out.println("\nCourse Content:\n" + decoratedSyllabus.getContent());
		System.out.println("\nUniversity Policies:\n" + decoratedSyllabus.getPolicies());
	}

	public Syllabus getSyllabus(){
		return decoratedSyllabus.getSyllabus();
	}

}
