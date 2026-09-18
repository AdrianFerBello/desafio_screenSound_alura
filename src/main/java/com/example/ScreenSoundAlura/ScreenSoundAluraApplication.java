package com.example.ScreenSoundAlura;

import com.example.ScreenSoundAlura.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.ScreenSoundAlura.principal.Principal;

@SpringBootApplication
public class ScreenSoundAluraApplication implements CommandLineRunner {

	@Autowired
	private ArtistaRepository artistaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ScreenSoundAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(artistaRepository);
		principal.exibirMenu();
	}
}
