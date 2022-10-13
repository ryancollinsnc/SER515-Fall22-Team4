public class Creator {

	private SylCreator syllabus;

	public Creator(SylCreator syllabus) {
		this.syllabus = syllabus;
	}

	public Syllabus getSyllabus() {
		return this.syllabus.getSyllabus();
	}

	public void createSyllabus() {
		this.syllabus.buildContent();
		this.syllabus.buildDetails();
		this.syllabus.buildPolicies();
	}

}
