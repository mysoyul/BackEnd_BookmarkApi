package com.bookmarker.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Profile("test")
public class WebConfig implements WebMvcConfigurer {

//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS")
//                .allowedOriginPatterns("*")
//                //.allowedHeaders("Authorization", "Content-Type")
//                .allowedHeaders("*")
//                .allowCredentials(false)
//                .maxAge(3600);
//    }



}