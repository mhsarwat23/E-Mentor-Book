package oxf.database.entity;

public class Mentordetails {
   private String mentor_id;
   private String name;
   private String from_usn;
   private String end_usn;
public Mentordetails(String mentor_id, String name, String from_usn, String end_usn) {
	super();
	this.mentor_id = mentor_id;
	this.name = name;
	this.from_usn = from_usn;
	this.end_usn = end_usn;
}
public String getMentor_id() {
	return mentor_id;
}
public void setMentor_id(String mentor_id) {
	this.mentor_id = mentor_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFrom_usn() {
	return from_usn;
}
public void setFrom_usn(String from_usn) {
	this.from_usn = from_usn;
}
public String getEnd_usn() {
	return end_usn;
}
public void setEnd_usn(String end_usn) {
	this.end_usn = end_usn;
}
   
}
