public class Timer {

	private universityPortal universityPortal;

	public void timerFunc() {
		
		universityPortal updatesOnPolicies = universityPortal.getUpdates();
		
		updatesOnPolicies.sendNotification();

	}

}
