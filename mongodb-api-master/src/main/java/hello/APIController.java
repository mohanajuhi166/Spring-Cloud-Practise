package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class APIController {

    public String a;

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/")
    public String queryMongo() {
        System.out.println("------starting");
		repository.deleteAll();
		System.out.println("------deleteAll() done");

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));
		System.out.println("------save() done");

        a = repository.findByFirstName("Alice").toString();
        System.out.println("------query done");
        return a;
    }
}