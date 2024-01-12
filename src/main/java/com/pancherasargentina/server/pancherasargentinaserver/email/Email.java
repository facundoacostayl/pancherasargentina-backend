package com.pancherasargentina.server.pancherasargentinaserver.email;

public class Email {
    private String senderEmail;
    private String receiverEmail;
    private String clientEmail;
    private String subject;
    private String message;

    public Email(){}

    public Email(String senderEmail, String receiverEmail, String clientEmail, String subject, String message) {
        this.senderEmail = senderEmail;
        this.receiverEmail = receiverEmail;
        this.clientEmail = clientEmail;
        this.subject = subject;
        this.message = message;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Email{" +
                "senderEmail='" + senderEmail + '\'' +
                ", receiverEmail='" + receiverEmail + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
