
public class User implements People {
	
	private String userID;
	private String userName;
	
	public User(String userID, String userName) {
			super();
			this.userID = userID;
			this.userName = userName;
		}
	
	@Override
	public String getUserID() {
		// TODO Auto-generated method stub
		return this.userID;
	}

	@Override
	public void setUserID(String userID) {
		// TODO Auto-generated method stub
		this.userID = userID;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return this.userName;
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}

	
	
}
