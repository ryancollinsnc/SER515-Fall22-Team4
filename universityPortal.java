public class universityPortal {
	
	private static universityPortal updatesOnPolicies = new universityPortal();

	private universityPortal() {
		
	}

	public universityPortal getUpdates() {
		if(updatesOnPolicies==null){
			System.out.println("");
			System.exit(0);
		}else {
			return updatesOnPolicies;
		}
		return null;
	}

	public void sendNotification() {
			System.out.println("Policies have been updated");
	}
}
