package com.ibm.hellodemo.emailer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// When application gets started, Spring checks @Component annotation and if found
// then it create the instance of the class and store it in ApplicationContext.
@Component
@Primary
public class DummyEmailSender implements IEmailerService{

	//Intilize the logger
	private static Log Log=LogFactory.getLog(DummyEmailSender.class);
	@Override
	public void sendEmail(String emailID, String subject, String mailContent) {
		{
			Log.info("Dummy Mail receiver ID : "+emailID);
			Log.info("Dummy Mail Subject : "+subject);
			Log.info("Dummy Mail Body : "+mailContent);
			Log.warn("This is just a Dummy email sender");
		}
	}
}
