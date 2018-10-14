package com.test.devtest.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestWebController {

    @RequestMapping("/test")
   public String test(){

       return "ok";

   }

}
