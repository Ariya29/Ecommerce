package examples.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User {

	private int userid;
	private String password;
	private String name;
	private char role;
	private boolean loginStatus;
	
	public User(int userid, String password, String name, char role) {
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.role = role;
		this.loginStatus = false;
	}

	public int getUserid() {
		return userid;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public char getRole() {
		return role;
	}

	public boolean isLoginStatus() {
		return loginStatus;
	}
	
	private void login(int userid, String password) {
		if (this.userid == userid && this.password.equals(password)) {
			loginStatus = true;
			System.out.println(name + " has logged in successfully");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}
	

	public void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Userid: ");
		int userid = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Password: ");
		String password = scanner.nextLine();
		
		
		
		login(userid, password);
	}
	
	public void logout() {
		loginStatus = false;
		System.out.println(name + " has logged out");
	}
	
	
}
