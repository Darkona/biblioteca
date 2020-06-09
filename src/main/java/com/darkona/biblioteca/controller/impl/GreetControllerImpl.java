package com.darkona.biblioteca.controller.impl;

import com.darkona.biblioteca.service.impl.GreetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetControllerImpl implements com.darkona.biblioteca.controller.GreetController {


    @Autowired
    private GreetServiceImpl greetService;

    @Override
    public String greet() {

        return greetService.prepareGreet();
    }

    @Override
    public String postGreet(@RequestBody String name) {

        return greetService.makeCustomGreet(name);
    }

    @Override
    public String putGreet() {

        return "put";
    }

    @Override
    public String deleteGreet() {

        return "delete";
    }

    @Override
    public String patchGreet() {

        return "patch";
    }


}
