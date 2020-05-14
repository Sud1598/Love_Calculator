package LCapi;

public class registrationDTO {
	
	private String name;
	private String uname;
	private char[] pass;
	private String country;
	private String[] hobby;
	private String gender;
	

	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public char[] getPass() {
		return pass;
	}
	public void setPass(char[] pass) {
		this.pass = pass;
	}

}
