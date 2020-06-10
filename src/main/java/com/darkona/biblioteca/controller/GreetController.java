package com.darkona.biblioteca.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public interface GreetController {
    @GetMapping("greet")
    String greet(@RequestParam(name="name", required=false) String name, Model model);

    @PostMapping("greet")
    String postGreet(@RequestBody String name);

    @PutMapping("greet")
    String putGreet();

    @DeleteMapping("greet")
    String deleteGreet();

    @PatchMapping("greet")
    String patchGreet();
}
