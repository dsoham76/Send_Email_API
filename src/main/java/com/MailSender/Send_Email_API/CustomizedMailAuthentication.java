package com.MailSender.Send_Email_API;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomizedMailAuthentication extends Authenticator {
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {


        return new PasswordAuthentication(MailMetaData.userName,MailMetaData.password);
    }
}