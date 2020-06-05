package com.darkona.biblioteca.service;

import com.darkona.biblioteca.model.Libro;
import org.springframework.stereotype.Service;

@Service
public class GreetService {



    public String prepareGreet(){
        Libro l = new Libro(0L);
        return l.toString();
    }

    public String makeCustomGreet(String name) {
        return "Hola " + name;
    }


}
