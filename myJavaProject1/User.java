package myJavaProject1;

public class User {
	
	private String firstName;
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}

	public void setFirstName(String fName){
		firstName = fName;
	}
	public void setLastName(String lName){
		lastName = lName;
	}
}
