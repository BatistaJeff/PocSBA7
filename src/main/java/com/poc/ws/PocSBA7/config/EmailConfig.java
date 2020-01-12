package com.poc.ws.PocSBA7.config;

import com.poc.ws.PocSBA7.services.email.EmailService;
import com.poc.ws.PocSBA7.services.email.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class EmailConfig {

    @Bean
    public EmailService emailService(){
        return new SmtpEmailService();
    }

}
