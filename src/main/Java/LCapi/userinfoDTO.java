package LCapi;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class userinfoDTO {

	@NotBlank(message="* Your name cannot be blank")
	//@Min(value =3,message = "*Your name must have atleast 3 char")
	@Size(min=2, max=10, message="*Your name must have atleast 2 char & maximum 10 char")
	private String username;
	
	@NotBlank(message="* Your name cannot be blank")
	//@Min(value =3,message = "*Your name must have atleast 3 char")
	@Size(min=2, max=10, message="*Your name must have atleast 2 char & maximum 10 char")
	private String crushname;
	
	@AssertTrue(message = "* Please accept the Terms and Conditions")
	private boolean termAndConditionAccepted;
	
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
	public boolean isTermAndConditionAccepted() {
		return termAndConditionAccepted;
	}
	public void setTermAndConditionAccepted(boolean termAndConditionAccepted) {
		this.termAndConditionAccepted = termAndConditionAccepted;
	}
	
		@Override
	public String toString() {
		return "userinfoDTO [username=" + username + ", crushname=" + crushname + "]";
	}
	
	

}
