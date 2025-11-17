package bahaeldin.com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

	@GetMapping(value = "/")
	void getMapping() {
		System.out.println("Hello World!");
	}

	@GetMapping(value = "bahaa")
	public String greeting() {
		return "Bahaeldin From fdslkjfds  Spring Server";
	}

	@GetMapping(value = "hello")
	public String hello() {
		System.out.println("Hello World!");
		return "Hello World!";
	}

	@GetMapping(value = "name")
	public String getName() {
		System.out.println("Hello World!");
		return "Bahaeldin Bahar Rahma";
	}

	@GetMapping(value = "lastname")
	public String getLastName() {
		System.out.println("Hello World!");
		return "Bahaeldin Bahar Rahma";
	}

}
