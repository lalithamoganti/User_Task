package com.codesspace.EasyBasket;

import org.springframework.stereotype.Component;
import com.codesspace.EasyBasket.AiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//@Component
public class ResponseGenerator {

    private AiServices aiModel;
@Autowired
    public ResponseGenerator(@Qualifier("chatGPTModel") AiServices ai){
        this.aiModel = ai;
    }
    public ResponseGenerator(AiServices ai,int a){
    }

    public void work(){
        // ChatGPT model = new ChatGPT();
        // model.generate();
        aiModel.generate();
    }
}
