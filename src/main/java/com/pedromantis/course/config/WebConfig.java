package com.pedromantis.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Permite apenas sua URL de produção
                registry.addMapping("/**")
                        .allowedOrigins("https://workshop-sb-prod.up.railway.app")
                        .allowedMethods("*");
            }
        };
    }

}
