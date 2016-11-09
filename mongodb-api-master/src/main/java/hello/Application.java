package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

//package hello;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Application implements CommandLineRunner {
//
//	@Autowired
//	private CustomerRepository repository;
//
//	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("------starting");
//		repository.deleteAll();
//		System.out.println("------deleteAll() done");
//
//		// save a couple of customers
//		repository.save(new Customer("Alice", "Smith"));
//		repository.save(new Customer("Bob", "Smith"));
//		System.out.println("------save() done");
////
////		// fetch all customers
////		System.out.println("Customers found with findAll():");
////		System.out.println("-------------------------------");
////		for (Customer customer : repository.findAll()) {
////			System.out.println(customer);
////		}
////		System.out.println();
////
////		// fetch an individual customer
////		System.out.println("Customer found with findByFirstName('Alice'):");
////		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//		System.out.println("------query done");
////
////		System.out.println("Customers found with findByLastName('Smith'):");
////		System.out.println("--------------------------------");
////		for (Customer customer : repository.findByLastName("Smith")) {
////			System.out.println(customer);
////		}
//
//	}
//
//}
