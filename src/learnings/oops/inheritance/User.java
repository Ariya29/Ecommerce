package learnings.oops.inheritance;

public abstract class User {

	private String name;
	private int userId;
	private String password;
	private String role;
	private boolean loginStatus;
		
	public User(String name, int userId, String password, String role) {
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.loginStatus = false;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getLoginStatus() {
		return loginStatus;
	}

	public void login(int userId, String password) {
	
		if (loginStatus) {
			System.out.println("User is already logged in");
		}
		else {
			if (userId == this.userId && password.equals(this.password)) {
				System.out.println(name + " successfully logged in");
				loginStatus = true;
			} else {
				System.out.println("Login failed");
			}
		}
	}
	
	public void logout() {
		if (loginStatus) {
			loginStatus = false;
			System.out.println("Logout Successful");
		} else {
			System.out.println("User is not logged in");
		}
	}
}
