package com.darkona.biblioteca.controller.impl;

import com.darkona.biblioteca.service.impl.GreetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GreetControllerImpl implements com.darkona.biblioteca.controller.GreetController {


    @Autowired
    private GreetServiceImpl greetService;

    @Override
    public String greet(String name, Model model) {
        model.addAttribute("name", name);
        return "index";
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
