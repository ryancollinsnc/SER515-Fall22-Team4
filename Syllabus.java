public class Syllabus implements CreateSyllabus {

	private String details;

	private String content;

	private String policies;

	public Syllabus() {
		this.details = null;
		this.content = null;
		this.policies = null;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setPolicies(String policies) {
		this.policies = policies;
	}

	public String getDetails() {
		return this.details;
	}

	public String getContent() {
		return this.content;
	}

	public String getPolicies() {
		return this.policies;
	}

}
