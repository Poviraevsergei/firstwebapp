package com.tms.solid.D.bad;

public class UserService {
    private EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public boolean registration(){
        //logic
        emailService.sendEmail("","","");
        return true;
    }

}
