package com.example;

import org.springframework.stereotype.Component;

@Component
class UserService {
    NotificationService saludo;

    public UserService(NotificationService saludo) {
        System.out.println("constructor UserService");
        this.saludo = saludo;
    }
}
