package com.bellinfo.advanced.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan(basePackages = "com.bellinfo.advanced.springmvc")
@EnableWebMvc
public class ApplicationConfig {

     @Bean
     public UrlBasedViewResolver urlBasedViewResolver(){
         UrlBasedViewResolver resolver = new UrlBasedViewResolver();
         resolver.setPrefix("/WEB-INF/pages/");
         resolver.setSuffix(".jsp");
         resolver.setViewClass(JstlView.class);
         return resolver;
     }

      /*@Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix("/WEB-INF/pages/");
        irvr.setSuffix(".jsp");
        return irvr;
    }*/


}
