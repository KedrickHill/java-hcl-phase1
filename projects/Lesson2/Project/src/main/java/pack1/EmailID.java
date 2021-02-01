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

    public String displayEmail() {
        return userName + "@" + domain;
    }

}
