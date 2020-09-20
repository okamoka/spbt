package com.example.demo;

import java.util.Optional;

import com.example.demo.domain.jpasample.Customer;
import com.example.demo.domain.jpasample.FileLob;
import com.example.demo.usecase.repository.CustomerRepository;
import com.example.demo.usecase.repository.FileLobRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Bean
	public CommandLineRunner fileLobTest(FileLobRepository repository) {
		return (args) -> {
			repository.save(new FileLob("aaa", 1L,"bbb".getBytes()));
			repository.save(new FileLob("bbb", 1L,"bbb".getBytes()));
			repository.save(new FileLob("ccc", 2L,"bbb".getBytes()));
			repository.save(new FileLob("ddd", 2L,"ccc".getBytes()));
			repository.save(new FileLob("eee", 3L,"bbb".getBytes()));

			repository.findByTid(2L).forEach(x -> {
				log.info(x.toString());
			});

		};
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			repository.save(new Customer("Jack", "Bauer"));
			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");
			// fetch an individual customer by ID
			// Optional<Customer> customer = repository.findById(1L);
			// log.info("Customer found with findById(1L):");
			// log.info("--------------------------------");
			// String logMessage = customer.get().toString();
			// log.info(logMessage);
			// log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
		};
	}
}
