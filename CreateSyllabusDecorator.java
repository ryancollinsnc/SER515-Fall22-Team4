public class CreateSyllabusDecorator implements CreateSyllabus {

	public CreateSyllabus decoratedSyllabus;

	/**
	 *
	 */
	protected CreateSyllabusDecorator(CreateSyllabus decoratedSyllabus) {
		this.decoratedSyllabus=decoratedSyllabus;
	}

	/**
	 *
	 */
	public void setDetails(String details) {
		decoratedSyllabus.setDetails(details);
	}

	/**
	 *
	 */
	public void setContent(String content) {
		decoratedSyllabus.setContent(content);
	}

	/**
	 *
	 */
	public void setPolicies(String policies) {
		decoratedSyllabus.setPolicies(policies);
	}

}
