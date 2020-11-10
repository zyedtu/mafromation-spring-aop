package fr.zied.formation.spring.mon.premier.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution( public * fr.zied.formation.spring.mon.premier.aspect.UserService.*(..) )")
	public void logDebut(JoinPoint joinPoint) {
		System.out.println("Début: appel à la méthode:" + joinPoint.getSignature().getName()
						 + " dans la classe: " + joinPoint.getSignature().getDeclaringTypeName());
	}
	
	@After("execution( public * fr.zied.formation.spring.mon.premier.aspect.UserService.*(..) )")
	public void logfin(JoinPoint joinPoint) {
		System.out.println("Fin: appel à la méthode:" + joinPoint.getSignature().getName()
						 + " dans la classe: " + joinPoint.getSignature().getDeclaringTypeName());
	}
}
