package in.anand.binding;

public class user {
	
	private String userName;
	private String pass;
	private String email;
	private Long phno;
	
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "user [uname=" + userName + ", pass=" + pass + ", email=" + email + ", phno=" + phno + "]";
	}
	
	

}
