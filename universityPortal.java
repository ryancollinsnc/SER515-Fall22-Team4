import java.util.*;
public class UniversityPortal {

	private static UniversityPortal updatesOnPolicies = new UniversityPortal();


	private UniversityPortal() {

	}

	public static UniversityPortal getUpdates() {
		if(updatesOnPolicies==null){
			updatesOnPolicies= new UniversityPortal();
		}
		return updatesOnPolicies;
	}

	public void sendNotification() {
			System.out.println("Policies have been updated");
	}
}
