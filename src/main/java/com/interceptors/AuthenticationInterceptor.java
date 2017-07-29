/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interceptors;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ext.acrispin
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationInterceptor.class);
    
    // Generaba el error: Instantiation of bean failed; nested exception is java.lang.ExceptionInInitializerError
    // esto debido a que no existia application.properties en \src\main\resources\ y ResourceBundle.getBundle("application") devolvia NULL
    private static final ResourceBundle settings = ResourceBundle.getBundle("application");

    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {

            log.info("Interceptor: Pre-handle");

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
            log.info("Post-handle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                    HttpServletResponse response, Object handler, Exception ex)
                    throws Exception {
            log.info("After-completion");
    }

}
