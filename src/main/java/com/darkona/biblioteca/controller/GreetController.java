package com.darkona.biblioteca.controller;

import com.darkona.biblioteca.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {


    @Autowired
    private GreetService greetService;

    @GetMapping("greet")
    public String greet() {

        return greetService.prepareGreet();
    }

    @PostMapping("greet")
    public String postGreet(@RequestBody String name) {

        return greetService.makeCustomGreet(name);
    }

    @PutMapping("greet")
    public String putGreet() {

        return "put";
    }

    @DeleteMapping("greet")
    public String deleteGreet() {

        return "delete";
    }

    @PatchMapping("greet")
    public String patchGreet() {

        return "patch";
    }


}
