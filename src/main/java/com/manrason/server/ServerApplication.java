package com.manrason.server;

import com.manrason.server.enumeration.Status;
import com.manrason.server.model.Server;
import com.manrason.server.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ServerRepository serverRepository){
		return args -> {
			serverRepository.save(new Server(
					null,
					"192.168.1.160",
					"Ubuntu Linux",
					"16 GB",
					"Personnal PC",
					"http://localhost:8080/server/image/server01.png",
					Status.SERVER_UP));
			serverRepository.save(new Server(
					null,
					"192.168.1.58",
					"Fedora Linux",
					"16 GB",
					"Dell",
					"http://localhost:8080/server/image/server02.png",
					Status.SERVER_DOWN));
			serverRepository.save(new Server(
					null,
					"192.168.1.21",
					"MS 2008",
					"32 GB",
					"WebServer",
					"http://localhost:8080/server/image/server03.png",
					Status.SERVER_UP));
			serverRepository.save(new Server(
					null,
					"192.168.1.14",
					"Red Hat",
					"64 GB",
					"Mail Server",
					"http://localhost:8080/server/image/server04.png",
					Status.SERVER_DOWN));
		};
	}

}
