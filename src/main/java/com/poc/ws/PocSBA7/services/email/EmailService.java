package com.poc.ws.PocSBA7.services.email;

import com.poc.ws.PocSBA7.domain.User;
import com.poc.ws.PocSBA7.domain.VerificationToken;

import javax.mail.internet.MimeMessage;

public interface EmailService {

    void sendHtmlEmail(MimeMessage msg);
    void sendConfirmationHtmlEmail(User user, VerificationToken vToken);

}
