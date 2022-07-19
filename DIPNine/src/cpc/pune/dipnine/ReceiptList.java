package cpc.pune.dipnine;

import java.util.List;

public class ReceiptList {
  private List<Receipt> receipts;

 
  public ReceiptList(List<Receipt> receipts) {
	super();
	this.receipts = receipts;
}



void displayReceiptList()
  {
	System.out.println("********* Receipts Info *********");
	  
	  for(Receipt r: receipts)
	  {
		r.displayReceipt();
	  }
	  
	  System.out.println("*******************************");  
  }
}
