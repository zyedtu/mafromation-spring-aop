package fr.zied.formation.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.zied.formation.spring.config.ConfigurationMonPremierAspect;
import fr.zied.formation.spring.model.User;
import fr.zied.formation.spring.mon.premier.aspect.UserService;

public class Main_MonPremierAspect {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationMonPremierAspect.class);
		UserService bean = applicationContext.getBean(UserService.class);
		User user = bean.getUser("zaroumia");
		System.out.println(user);
	}
}
