package com.MailSender.Send_Email_API;

public class MyObject {

    private String to;
    private String from;



    public MyObject(String to, String from) {
        this.to = to;
        this.from = from;

    }

    @Override
    public String toString() {
        return "To:"+this.to+"\n"+"From:"+this.from;
    }
}