package com.pancherasargentina.server.pancherasargentinaserver.validators;

import com.pancherasargentina.server.pancherasargentinaserver.email.Email;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmailValidator extends Email {

    @Valid

    @NotNull
    @NotBlank
    private String senderEmail;
    @NotNull
    @NotBlank
    private String subject;
    @NotNull
    @NotBlank
    private String message;

    public EmailValidator(){}

    public EmailValidator(String senderEmail, String subject, String message) {
        this.senderEmail = senderEmail;
        this.subject = subject;
        this.message = message;
    }

    @Override
    public String getSenderEmail() {
        return senderEmail;
    }

    @Override
    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
