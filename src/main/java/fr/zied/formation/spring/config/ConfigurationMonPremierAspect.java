package fr.zied.formation.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("fr.zied.formation.spring.mon.premier.aspect")
public class ConfigurationMonPremierAspect {

}
