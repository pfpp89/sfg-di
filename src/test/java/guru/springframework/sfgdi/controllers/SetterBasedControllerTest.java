package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingService;

public class SetterBasedControllerTest {

	private SetterBasedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new SetterBasedController();
		
		controller.setGreetingService(new ConstructorGreetingService());
	}
	
	@Test
	public void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
