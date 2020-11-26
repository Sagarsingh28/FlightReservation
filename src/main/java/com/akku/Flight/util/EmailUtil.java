package com.akku.Flight.util;

public interface EmailUtil {

	void sendMail(String toAddress,String subject, String message);

	void sendMailWithPdf(String toAddress, String filePath);
}
