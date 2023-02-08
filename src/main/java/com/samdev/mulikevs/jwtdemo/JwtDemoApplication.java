package com.samdev.mulikevs.jwtdemo;

import com.samdev.mulikevs.jwtdemo.entity.User;
import com.samdev.mulikevs.jwtdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class JwtDemoApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
			new User(101,"meliodas","123test","7 Deadly sins","meliodas@dadlysins.com"),
				new User(102,"gowther","123test","7 Deadly sins","gowther@dadlysins.com"),
				new User(103,"escanor","123test","7 Deadly sins","escanor@dadlysins.com"),
				new User(104,"merlin","123test","7 Deadly sins","merlin@dadlysins.com"),
				new User(105,"ban","123test","7 Deadly sins","ban@dadlysins.com")
				).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

}
