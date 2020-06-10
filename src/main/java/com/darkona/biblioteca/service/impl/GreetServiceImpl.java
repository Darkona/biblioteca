package com.darkona.biblioteca.service.impl;

import com.darkona.biblioteca.model.Book;
import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements com.darkona.biblioteca.service.GreetService {



    @Override
    public String prepareGreet(){
        Book l = new Book(0L);
        return l.toString();
    }

    @Override
    public String makeCustomGreet(String name) {
        return "Hola " + name;
    }


}
