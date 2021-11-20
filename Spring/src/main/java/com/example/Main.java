package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludando = (Saludo) context.getBean("saludando");
        String texto = saludando.imprimirSaludo();
        System.out.println(texto);

    }
}
