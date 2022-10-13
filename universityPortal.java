public class universityPortal {
	
	private static universityPortal updatesOnPolicies = new universityPortal();

	private universityPortal() {
		
	}

	public universityPortal getUpdates() {
		
         return updatesOnPolicies;
	}

	public void sendNotification() {
		
			System.out.println("Policies have been updated");
	}
}
