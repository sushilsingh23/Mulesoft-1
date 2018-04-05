package trmrdemo;

public class Account {
	private String fname,lname,email;
	public String getFname() {
		return fname;
	}
	public Account(String fname, String lname, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Account(){
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fname+" "+lname+" "+email;
	}
	
}
