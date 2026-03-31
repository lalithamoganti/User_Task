package com.codesspace.EasyBasket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class EasyBasketApplication {
	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(EasyBasketApplication.class, args);
		 //ResponseGenerator rg = context.getBean(ResponseGenerator.class);
		  //ResponseGenerator rg2 = context.getBean(ResponseGenerator.class);
		 //Claude claude = context.getBean(Claude.class);
		//Claude claude2 = context.getBean(Claude.class);

		 //context.close();
		// ResponseGenerator rg = new ResponseGenerator(new Gemini());
		//rg.work();
	}
}