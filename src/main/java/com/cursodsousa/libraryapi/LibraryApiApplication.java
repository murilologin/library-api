package com.cursodsousa.libraryapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableAsync
@SpringBootApplication
@EnableScheduling
public class LibraryApiApplication {

	//usar public class LibraryApiApplication extends SpringBootServletInitializer { para tomcat, alterar no pom também

	//@Autowired
	//private EmailService emailService;

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			List<String> emails = Arrays.asList("df0e8a98eb-b85b5f@inbox.mailtrap.io");
			emailService.sendMails("Testando serviço de emails", emails);
			System.out.println("EMAILS ENVIADOS COM SUCESSO");
		};
	}
	*/

	public static void main(String[] args) {
		SpringApplication.run(LibraryApiApplication.class, args);
	}

}
