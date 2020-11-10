package fr.zied.formation.spring.mon.premier.aspect;

import org.springframework.stereotype.Component;

@Component
public class MonLogger {

	public void LogDebutMethode(final String classe, final String methode) {
		System.out.println("Début : appel de la méthode " + methode + " dans la classe " + classe);
	}

	public void LogFinMethode(final String classe, final String methode) {
		System.out.println("Fin : appel de la méthode " + methode + " dans la classe " + classe);
	}
}
