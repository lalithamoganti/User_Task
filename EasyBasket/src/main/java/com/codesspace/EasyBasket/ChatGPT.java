package com.codesspace.EasyBasket;

import com.codesspace.EasyBasket.AiServices;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;
//@Service("chatGPTModel")

public class ChatGPT implements AiServices {
    public void generate(){
        System.out.println("Generating response using ChatGPT...");
    }
}
