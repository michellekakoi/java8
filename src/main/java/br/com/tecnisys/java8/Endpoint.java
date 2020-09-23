package br.com.tecnisys.java8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Endpoint {

    @GetMapping
    public void versao(){
        return System.out.println("mudada");
    }
}
