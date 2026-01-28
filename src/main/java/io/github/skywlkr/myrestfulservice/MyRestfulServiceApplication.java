package io.github.skywlkr.myrestfulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyRestfulServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MyRestfulServiceApplication.class, args);

		/*String[] beanDefinitionNames = ac.getBeanDefinitionNames();

		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}*/
	}

}
