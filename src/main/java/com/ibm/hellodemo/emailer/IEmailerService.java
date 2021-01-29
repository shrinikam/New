package com.ibm.hellodemo.emailer;

public interface IEmailerService {
	void sendEmail(String emailID, String subject, String mailContent);

}
