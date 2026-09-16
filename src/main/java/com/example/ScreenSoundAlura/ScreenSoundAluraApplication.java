package com.example.ScreenSoundAlura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.ScreenSoundAlura.principal.Principal;

@SpringBootApplication
public class ScreenSoundAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenSoundAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibirMenu();
	}
}
