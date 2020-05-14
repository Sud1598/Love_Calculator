package LCapi;

public class userinfoDTO {
	
	
	private String username="sudesh";
	private String crushname="kusum";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCrushname() {
		return crushname;
	}
	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}
	@Override
	public String toString() {
		return "userinfoDTO [username=" + username + ", crushname=" + crushname + "]";
	}
	
	

}
