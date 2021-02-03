package pack1;

public class EmailID {

    
    private String userName;
    private String domain;

    public EmailID(String userName, String domain) {
        this.userName = userName;
        this.domain = domain;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	
	public static boolean isValid(String id) { 
		//TODO: checks if a string is a valid email format

		// base case: no @ to distinguish domain
		if (!id.contains("@")) { //if there is no @ then its invalid
			return false;
		} 

		String[] arrID = id.split("@", 2);

		if (arrID[1].contains("@")) {
			return false;
		}

		return true;
	}

	public String displayEmail() {
        return userName + "@" + domain;
	}

	
}
