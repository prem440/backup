package com.te.PhonePay;

import java.util.logging.Logger;

public class Process {
	public static final Logger logger = Logger.getLogger("com.te.PhonePay");

	public static void main(String[] args) {
		User reciever=new User();
		reciever.setU_name("amir");
	    reciever.setU_balance(999);
		reciever.setUpi_Id("9833947245@ybl");
		reciever.setU_mobile_no(9833947245l);
		User user=new User();
		user.setU_name("ajay");
		user.setU_balance(126069);
		user.setU_mobile_no(8788033661l);	
		user.setUpi_Id("87880336601@sbi");
		PhonePay p=new PhonePay();
		p.u.add(user);
		p.u.add(reciever);
		p.sendmoney(9833947245l, 500);
		
		logger.fine("program is completed");
		
	}

}
