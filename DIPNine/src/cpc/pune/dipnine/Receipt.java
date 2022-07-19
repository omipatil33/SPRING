package cpc.pune.dipnine;

public class Receipt {
	private int rno;
	private String rdate;
	private int ramt;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public int getRamt() {
		return ramt;
	}
	public void setRamt(int ramt) {
		this.ramt = ramt;
	}
	
	void displayReceipt(){		
		System.out.println(rno + " " + rdate + " " + ramt);
	}
 
}
