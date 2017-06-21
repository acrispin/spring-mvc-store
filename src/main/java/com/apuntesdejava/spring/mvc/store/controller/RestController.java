/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apuntesdejava.spring.mvc.store.controller;

import javax.servlet.http.HttpServletResponse; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.models.Person;
 
@Controller
@RequestMapping("/rest/person")
public class RestController {
 
  public RestController(){
      System.out.println("init RestController");
  }
 
  //this method responses to GET request http://localhost/spring-mvc-store/rest/person
  // return Person object as json 
  @RequestMapping(method = RequestMethod.GET)
  public @ResponseBody Person get(HttpServletResponse res) {
      System.out.println("GET");
      Person person = new Person();
      person.setId(1);
      person.setName("Test");
      person.setDni("12345678");
      return person;
  }
  
  //this method response to POST request http://localhost/spring-mvc-store/rest/person
  // receives json data sent by client --> map it to Person object
  // return Person object as json
  @RequestMapping(method = RequestMethod.POST)
  public @ResponseBody Person post(@RequestBody final Person item) { 
      System.out.println("POST");
      System.out.println(item.getId() + " - " + item.getName() + " - " + item.getDni());
      return item;
  }
  
  //this method response to PUT request http://localhost/spring-mvc-store/rest/person
  // receives json data sent by client --> map it to Person object
  // return Person object as json
  @RequestMapping(method = RequestMethod.PUT)
  public @ResponseBody Person put(@RequestBody final Person item) { 
      System.out.println("PUT");
      System.out.println(item.getId() + " - " + item.getName() + " - " + item.getDni());
      return item;
  }
  
  //this method response to DELETE request http://localhost/spring-mvc-store/rest/person
  // receives json data sent by client --> map it to Person object
  // return Person object as json
  @RequestMapping(method = RequestMethod.DELETE)
  public @ResponseBody Person del(@RequestBody final Person item) { 
      System.out.println("DELETE");
      System.out.println(item.getId() + " - " + item.getName() + " - " + item.getDni());
      return item;
  }
 
  //this method response to POST request http://localhost/spring-mvc-store/rest/person/person2
  // receives json data sent by client --> map it to Person object
  // return Person object as json
  @RequestMapping(value="person2", method = RequestMethod.POST)
  public @ResponseBody Person post2(@RequestBody final Person item) { 
      System.out.println(item.getId() + " - " + item.getName() + " - " + item.getDni());
      return item;
  }
  
}
