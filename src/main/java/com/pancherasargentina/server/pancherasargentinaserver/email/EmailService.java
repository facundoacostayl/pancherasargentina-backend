package com.pancherasargentina.server.pancherasargentinaserver.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(Email email) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom("facundoacostayl@gmail.com");
        mail.setTo(email.getReceiverEmail());
        mail.setSubject(email.getSubject());
        mail.setText(email.getMessage());

        mailSender.send(mail);
    }

}
