package fr.zied.formation.spring.mon.premier.aspect;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.zied.formation.spring.model.User;

@Component
public class UserService {

	private final List<User> usersCollection;
//	@Autowired
//	private MonLogger logger;

	public UserService() {
		usersCollection = new ArrayList<>();
		usersCollection.add(new User("zaroumia", "zaroumia@gmail.com"));
		usersCollection.add(new User("mowmow", "mowmow@gmail.com"));
		usersCollection.add(new User("younes", "younes@gmail.com"));
	}

	public boolean isUsernameExists(final String username) {

		boolean anyMatch = usersCollection.stream().map(User::getUsername).anyMatch(e -> e.equals(username));

		return anyMatch;
	}

	public User getUser(final String username) {
//		logger.LogDebutMethode("UserService", "getUser");

		User user = usersCollection.stream().filter(e -> e.getUsername().equals(username)).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("username introuvable"));

		return user;
	}
}
