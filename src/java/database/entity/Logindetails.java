package oxf.database.entity;

public class Logindetails {
   private String usn;
   private String password;
   public Logindetails(String usn, String password) {
	super();
	this.usn = usn;
	this.password = password;
}

public String getUsn() {
	return usn;
}
public void setUsn(String usn) {
	this.usn = usn;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

   
}
