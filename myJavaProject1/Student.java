package myJavaProject1;

public class Student extends User implements Trainee{

	private String fieldOfStudy;
	
	public String getFieldOfStudy () {
		return this.fieldOfStudy;
	}
	
	
	public void setFieldOfStudy (String fOfStudy) {
		this.fieldOfStudy = fOfStudy;
	}


	@Override
	public int getParentCosts() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String getFullName() {
		return getFirstName() + getLastName() + "-Student";
	}
}
