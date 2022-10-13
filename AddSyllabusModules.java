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

}
