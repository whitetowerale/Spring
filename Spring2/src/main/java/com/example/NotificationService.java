package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void imprimirSaludo(){
        System.out.println("Hoooola");
    }

    public NotificationService() {
        System.out.println("Constructor NotificationService");
    }
}
