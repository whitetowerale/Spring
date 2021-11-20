package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludar = (Saludo) context.getBean("saludo");
        String texto = saludar.imprimirSaludo();
        System.out.println(texto);

    }
}
