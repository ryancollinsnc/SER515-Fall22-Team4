public class PublishAdapter implements PublishSyllabusService {

	private PublishSyllabusCanvas pub;

	public PublishAdapter(PublishSyllabusCanvas pub) {
		this.pub = pub;
	}

	public void publishService(Syllabus s) {
		pub.publishCanvas(s);
	}

}
