package oxf.database.entity;

public class Feesdetails {
   private String usn;
   private int Total_fees;
   private int fees_paid;
   private int balance;
public Feesdetails(String usn, int totalfees, int feespaid, int balance) {
	super();
	this.usn = usn;
	this.Total_fees = totalfees;
	this.fees_paid = feespaid;
	this.balance = balance;
}
public String getUsn() {
	return usn;
}
public void setUsn(String usn) {
	this.usn = usn;
}
public int getTotal_fees() {
	return Total_fees;
}
public void setTotal_fees(int total_fees) {
	Total_fees = total_fees;
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
