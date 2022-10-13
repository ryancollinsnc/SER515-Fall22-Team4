public class Canvas implements PublishSyllabusCanvas{
	public void publishCanvas(Syllabus s) {
		System.out.println("Published " + s.getDetails());
	}
}
