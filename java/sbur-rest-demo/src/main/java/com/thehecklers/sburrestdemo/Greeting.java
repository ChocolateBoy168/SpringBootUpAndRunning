package com.thehecklers.sburrestdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@Component 若不用 @ConfigurationPropertiesScan  似乎可改用 @Component
@ConfigurationProperties(prefix = "my.greeting")
public class Greeting {
	private String name;
	private String coffee;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoffee() {
		return coffee;
	}

	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
}
