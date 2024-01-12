package com.pancherasargentina.server.pancherasargentinaserver.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/email")
public class EmailController
{
    @Autowired
    private JavaMailSender emailSender;

    @PostMapping
    public void sendSimpleMessage(
            String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("facundoacostayl@gmail.com");
        message.setTo("kittyfacu21@gmail.com");
        message.setSubject("Compra Pagina");
        message.setText("Quiero realizar una consulta acerca de las pancheras.");
        emailSender.send(message);
    }
}
