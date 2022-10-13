// CreateSyllabusDecorator

public class CreateSyllabusDecorator implements CreateSyllabus {

	public CreateSyllabus decoratedSyllabus;

	protected CreateSyllabusDecorator(CreateSyllabus decoratedSyllabus) {
		this.decoratedSyllabus=decoratedSyllabus;
	}

	public void setDetails(String details) {
		decoratedSyllabus.setDetails(details);
	}

	public void setContent(String content) {
		decoratedSyllabus.setContent(content);
	}

	public void setPolicies(String policies) {
		decoratedSyllabus.setPolicies(policies);
	}

	public String getDetails() {
		return decoratedSyllabus.getDetails();
	}
	public String getContent() {
		return decoratedSyllabus.getContent();
	}
	public String getPolicies() {
		return decoratedSyllabus.getPolicies();
	}

	public Syllabus getSyllabus() {
		Syllabus s = new Syllabus();
		s.setDetails(decoratedSyllabus.getDetails());
		s.setContent(decoratedSyllabus.getContent());
		s.setPolicies(decoratedSyllabus.getPolicies());
		return s;
	}
}
