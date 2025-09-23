package com.tms.solid.D.good;

public class UserService {
    private final MessageService messageService;

    public UserService(MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean registration() {
        //logic
        messageService.sendEmail("", "", "");
        return true;
    }

}
