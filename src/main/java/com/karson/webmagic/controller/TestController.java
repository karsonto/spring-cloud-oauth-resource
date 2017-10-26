package com.karson.webmagic.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
	  @GetMapping("/product/{id}")
	    public String getProduct(@PathVariable String id) {
	       
	        return "product id : " + id;
	    }
	  
	    @GetMapping("/order/{id}")
	    public String getOrder(@PathVariable String id) {
	      
	        return "order id : " + id;
	    }
	    @RequestMapping("/")
	    public String home() {
	        return new String("Hello World");
	    }
}
