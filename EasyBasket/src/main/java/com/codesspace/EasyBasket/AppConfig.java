package com.codesspace.EasyBasket;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
@Configuration
public class AppConfig {

    @Value("${EasyBasket.aiModel}")
    private String model;

    @Bean
     public AiServices gemini(){
        return new Gemini();
     }
    @Bean
     public AiServices chatGPT(){
        return new ChatGPT();
     }

     @Bean
     @Scope("prototype")
     public ResponseGenerator responseGenerator(){
        if(model.equals("chatGPT"))
           return new ResponseGenerator(new ChatGPT());
     
        
    return new ResponseGenerator(new Gemini());
        
     }
}