package com.MailSender.Send_Email_API;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    // Define beans for the objects you want to create this is basically an objecct made by spring it self
    @Bean
    public MyObject myObject() {
        return new MyObject(MailMetaData.userName,MailMetaData.receiverMail);
    }


}