package com.inesh.fakestorethirdpartyapis.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {

    @RequestMapping(value = "/fakeStore", method = RequestMethod.GET)
    public String Greet(){
        return "Hello Welcome to FakeStore !!";
    }

    @RequestMapping(value = "/fakeStore/{name}", method = RequestMethod.GET)
    public String GreetWithVariables(@PathVariable String name){
        return "Hello " + name +", Welcome to FakeStore !!";
    }
}
