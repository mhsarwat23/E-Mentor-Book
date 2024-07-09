package oxf.database.entity;

public class Studentdetails2 {
	   private String usn;
	   private String name;
	   private String phonenumber;
	   private String dept;
	   private String cgpa;
	   private String currentsem;
	   
	public Studentdetails2(String usn, String name, String phonenumber, String currentsem, String dept, String cgpa) {
		super();
		this.usn = usn;
		this.name = name;
		this.phonenumber = phonenumber;
		this.dept = dept;
		this.cgpa = cgpa;
		this.currentsem = currentsem;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	public String getCurrentsem() {
		return currentsem;
	}
	public void setCurrentsem(String currentsem) {
		this.currentsem = currentsem;
	}

}
