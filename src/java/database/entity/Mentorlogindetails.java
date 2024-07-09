package oxf.database.entity;

public class Mentorlogindetails {
    private String mentor_id;
    private String password;
    
	public Mentorlogindetails(String usn, String password) {
		super();
		this.mentor_id = usn;
		this.password = password;
	}
	public String getmentorid(){
		return mentor_id;
	}
	public void setmentorid(String usn) {
		this.mentor_id = usn;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
