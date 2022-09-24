package com.te.PhonePay;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PhonePay {
	public static final Logger logger = Logger.getLogger("com.te.PhonePay");
	List<User> u;

	public PhonePay() {
		u = new ArrayList<>();
		logger.setLevel(Level.ALL);
		FileHandler fh;
		try {
			fh = new FileHandler("logOfTransaction");
			fh.setLevel(Level.ALL);
			logger.addHandler(fh);
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void sendmoney(long phoneno, double amt) {
		List<User> collect = u.stream().filter(uu -> uu.getU_mobile_no() == phoneno).collect(Collectors.toList());
		if (!collect.isEmpty()) {
			User reciever=collect.get(0);
			double newbalance=reciever.getU_balance()+amt;
			reciever.setU_balance(newbalance);
			logger.fine("the transaction is successfull. you paid to "+reciever.getU_name()+"amount is"+amt);
			logger.fine("the amount of");

		}
		else {
			logger.warning("the user you are looking for its not on phone pay....");
		}
		
	}
}
