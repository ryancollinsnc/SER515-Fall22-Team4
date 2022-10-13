public class Timer {

	private UniversityPortal universityPortal;
	int counter=0;

	public void timerFunc() {
		UniversityPortal updatesOnPolicies = null;
		boolean chk_upd = checkUpdates();
		if(counter%24==0 && chk_upd== true){
			updatesOnPolicies = UniversityPortal.getUpdates();
			updatesOnPolicies.sendNotification();
			counter=0;
		}
		else{
				System.out.println("No Updates");
				updatesOnPolicies = null;
				counter+= 12;
		}
	}

	public boolean checkUpdates(){
		if(Math.random()>0.5) {
			return true;
		}
		else {
			return false;
		}
	}
}
