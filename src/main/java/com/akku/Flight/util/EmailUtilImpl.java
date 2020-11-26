package com.akku.Flight.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	private JavaMailSender jms;
	
	@Override
	public void sendMailWithPdf(String toAddress, String filePath) {
		MimeMessage mimeMessage = jms.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
			helper.setTo(toAddress);
			helper.setSubject("Flight Confirmation Email and regarding Information");
			helper.setText("Please Find Your Attachments Below : ");
			helper.addAttachment("Flight Booking", new File(filePath));
			jms.send(mimeMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void sendMail(String toAddress, String subject, String message) {
		MimeMessage mimeMessage = jms.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
		try {
			helper.setTo(toAddress);
			helper.setSubject(subject);
			helper.setText(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		jms.send(mimeMessage);
	}

}
