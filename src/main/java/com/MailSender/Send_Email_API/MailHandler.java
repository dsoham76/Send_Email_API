package com.MailSender.Send_Email_API;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailHandler {
    void sendMail(){
        Properties sysProperties=System.getProperties();
        //This gives me a HASHTABLE;
        sysProperties.put("mail.smtp.host",MailMetaData.HostServer);
        sysProperties.put("mail.smtp.port",MailMetaData.port);
        sysProperties.put(MailMetaData.sslProperty,"true");
        sysProperties.put(MailMetaData.authPerm,"true");
        //Create a session  using sender's mail id and password
        Authenticator authenticator=new CustomizedMailAuthentication();
        Session mailSession=Session.getInstance(sysProperties,authenticator);

        //MIME Message build
        try{
            MimeMessage mailMessage=new MimeMessage(mailSession);
            mailMessage.setFrom(MailMetaData.userName);
            mailMessage.setSubject("My Mail");
            mailMessage.setText("Hi Soham, I hope you got this mail");
            Address reciveEmail=new InternetAddress(MailMetaData.receiverMail);
            mailMessage.setRecipient(Message.RecipientType.TO,reciveEmail);
            Transport.send(mailMessage);

        }
        catch(Exception mailException){
            System.out.println(mailException.toString());
        }
    }
}
