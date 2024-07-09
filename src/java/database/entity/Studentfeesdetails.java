package oxf.database.entity;

public class Studentfeesdetails {
   private String usn;
   private String name;
   private int total_fees;
   private int fees_paid;
   private int balance;
public Studentfeesdetails(String usn, String name, int total_fees, int fees_paid, int balance) {
	super();
	this.usn = usn;
	this.name = name;
	this.total_fees = total_fees;
	this.fees_paid = fees_paid;
	this.balance = balance;
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
public int getTotal_fees() {
	return total_fees;
}
public void setTotal_fees(int total_fees) {
	this.total_fees = total_fees;
}
public int getFees_paid() {
	return fees_paid;
}
public void setFees_paid(int fees_paid) {
	this.fees_paid = fees_paid;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
   
}
