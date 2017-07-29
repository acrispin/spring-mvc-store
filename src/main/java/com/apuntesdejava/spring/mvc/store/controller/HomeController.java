/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apuntesdejava.spring.mvc.store.controller;

import com.models.Shop;
//import com.ws.azman.ArrayOfBEOpcionMenu;
//import com.ws.azman.IServicioAzman;
//import com.ws.azman.IServicioAzmanObtenerListaPermisosConCredencialesServicioErrorFaultFaultMessage;
//import com.ws.azman.ServicioAzman;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author dsilva
 */
@Controller
public class HomeController {
    
    public HomeController(){
      System.out.println("init HomeController");
    }
    
    @RequestMapping("/")
    public String welcome(Model model, HttpServletRequest request){
        System.out.println("Set code to session");
        request.getSession().setAttribute("code", "12345");
        model.addAttribute("greeting", "Bienvenido a la tienda virtual!");
        model.addAttribute("tagline", "Un aporte de apuntesdejava.com");        
        return "welcome";
    }
    
    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody Shop getShopInJSON(@PathVariable String name, HttpServletRequest request) {
        String code = (String) request.getSession().getAttribute("code");
        System.out.println("Code from getShopInJSON: " + code);
        Shop shop = new Shop();
        shop.setName(name);
        shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
        return shop;
    }
    
    @RequestMapping(value="shop/list", method = RequestMethod.GET)
    public @ResponseBody List<Shop> getShopInJSONList() {
        List<Shop> list = new ArrayList<>();
        Shop shop = new Shop();
        shop.setName("Test");
        shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
        list.add(shop);
        return list;
    }
    
    @RequestMapping(value="test/dict", method = RequestMethod.GET, consumes="application/json", produces={ "application/json"})
    public @ResponseBody Map<String, Object> getDict() {
        Map<String, Object> dict = new HashMap<>();
        dict.put("name", "Carlos");
        dict.put("code", "00255");
        dict.put("active", true);
        return dict;
    }
    
    @RequestMapping(value="test/dict2", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> getDict2() {
        Map<String, Object> dict = new HashMap<>();
        dict.put("name", "Carlos");
        dict.put("code", "00255");
        dict.put("active", true);
        return dict;
    }
    
    @RequestMapping(value="articles/list", method = RequestMethod.GET)
    public @ResponseBody List<Map<String, Object>> getArticles(HttpServletRequest request) {
          
//        System.out.println("Test al servicio azman");
//        ServicioAzman service = new ServicioAzman();
//        IServicioAzman client = service.getEpAzman();
//        ArrayOfBEOpcionMenu menus;
//        try {
//            menus = client.obtenerListaPermisosConCredenciales("COTVIDAWEB", 
//                                                               "DINTERSEGURO", 
//                                                               "rcastillo@interseguro.com.pe", 
//                                                               "Lexus#1234",
//                                                               645);
//        } 
//        catch (IServicioAzmanObtenerListaPermisosConCredencialesServicioErrorFaultFaultMessage ex) {
//            System.out.println("Error ...");
//            System.out.println(ex.getMessage());
//            menus = new ArrayOfBEOpcionMenu();
//        } 
//        catch (Exception ex){
//            System.out.println("Error 2 ...");
//            System.out.println(ex.getMessage());
//            System.out.println(ex);
//            menus = new ArrayOfBEOpcionMenu();
//        }
//        
//        if(menus != null){
//            System.out.println("size of menus: " + menus.getBEOpcionMenu().size());
//        }
        
        String code = (String) request.getSession().getAttribute("code");
        System.out.println("Code: " + code);

        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> dict = new HashMap<>();
        dict.put("_id", "1");
        dict.put("name", "Articulo 1");
        dict.put("code", "00255");
        dict.put("active", true);
        list.add(dict);
        Map<String, Object> dict2 = new HashMap<>();
        dict2.put("_id", "2");
        dict2.put("name", "Articulo 2");
        dict2.put("code", "007535");
        dict2.put("active", true);
        list.add(dict2);
        Map<String, Object> dict3 = new HashMap<>();
        dict3.put("_id", "3");
        dict3.put("name", "Articulo 4");
        dict3.put("code", "08674");
        dict3.put("active", true);
        list.add(dict3);
        return list;
    }
    
}
