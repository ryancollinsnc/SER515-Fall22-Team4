public class SyllabusPatternTwo implements SylCreator {

	private Syllabus syllabus;
	private String details;
	private String content;
	private String policies;

	public SyllabusPatternTwo(String details, String content, String policies) {
		this.syllabus = new Syllabus();
		this.details = details;
		this.content = content;
		this.policies = policies;
	}

	public void buildDetails() {
		syllabus.setDetails(details);
	}

	public void buildContent() {
		syllabus.setContent(content);
	}

	public void buildPolicies() {
		syllabus.setPolicies(policies);
	}

	public Syllabus getSyllabus() {
		return this.syllabus;
	}

	public void displaySyllabus() {
		System.out.println("\nSyllabus Pattern for SE");
		System.out.println("Course Details\n" + syllabus.getDetails());
		System.out.println("\nCourse Content\n" + syllabus.getContent());
		System.out.println("\nUniversity Policies\n" + syllabus.getPolicies());
	}
}
