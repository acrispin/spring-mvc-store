/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interceptors;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author ext.acrispin
 */
@Component
public class AuthenticationInterceptor2 extends HandlerInterceptorAdapter {

    //private static final Logger log = LoggerFactory.getLogger(AuthenticationInterceptor.class);
//    static String bundle = "configuration";
//    public static ResourceBundle settings = ResourceBundle.getBundle(bundle);

    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {

//            log.info("Interceptor: Pre-handle");
            System.out.println("Interceptor: Pre-handle 2");

//		// Avoid a redirect loop for some urls
//		if( !request.getRequestURI().equals("/sample-interc/") &&
//		    !request.getRequestURI().equals("/sample-interc/login.do") &&
//		    !request.getRequestURI().equals("/sample-interc/login.failed"))
//		  {
//			  LoginForm userData = (LoginForm) request.getSession().getAttribute("LOGGEDIN_USER");
//		   if(userData == null)
//		   {
//		    response.sendRedirect("/sample-interc/");
//		    return false;
//		   }   
//		  }
              return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                    HttpServletResponse response, Object handler,
                    ModelAndView modelAndView) throws Exception {
//            log.debug("Post-handle");
            System.out.println("Post-handle 2");
    }

   @Override
    public void afterCompletion(HttpServletRequest request,
                    HttpServletResponse response, Object handler, Exception ex)
                    throws Exception {
//            log.debug("After-completion");
            System.out.println("After-completion 2");
    }

}
