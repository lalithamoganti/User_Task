package com.codesspace.EasyBasket;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.codesspace.EasyBasket.AiServices;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
//@Service
//@Primary
public class Gemini implements AiServices{
    @Value("${EasyBasket.country}")
    private String country;
    @Value("${EasyBasket.enable}")
    private boolean enable;
   // @Value("$EasyBasket.listOfValues")
   // private List<String>values;

   public Gemini(){
     System.out.println("Gemini bean is created");
    }
    public void generate(){
        System.out.println("This is gemini response");
        System.out.println("EayBasket's country: "+country);
        System.out.println("Is EasyBasket enabled? "+enable);
        //System.out.println("")
    }
}