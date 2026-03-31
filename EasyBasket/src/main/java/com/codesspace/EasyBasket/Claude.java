package com.codesspace.EasyBasket;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component
@Scope()
public class Claude {
    
   public Claude() {
        System.out.println("Claude model initialized.");
    }
    @PostConstruct
     public void generate() {
        System.out.println("Claude Post Construct");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Claude bean is being destroyed.");
    }
}
