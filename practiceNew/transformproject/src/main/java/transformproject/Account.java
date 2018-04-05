package transformproject;

public class Account {
	private String fname,lname,email;
	public Account(){
		
	}
	public Account(String fname,String lname,String email){
		this.fname=fname;
		this.lname=lname;
		this.email=email;
	}
	@Override
	public String toString() {
		return fname+" "+lname+" "+email;
	}
	public String getFname() {
		return fname;
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
}
