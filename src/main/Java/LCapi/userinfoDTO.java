package LCapi;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class userinfoDTO {

	@NotBlank(message="* Your name cannot be blank")
	@Min(value =3,message = "Your name must have atleast 3 char")
	private String username;
	private String crushname;
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
