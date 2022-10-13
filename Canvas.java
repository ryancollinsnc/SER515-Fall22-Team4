public class Canvas implements PublishSyllabusCanvas{

	private PublishSyllabusCanvas publishSyllabusCanvas;

	public void publishCanvas(Syllabus s) {
		System.out.println("Published " + s.getDetails());
	}
}
