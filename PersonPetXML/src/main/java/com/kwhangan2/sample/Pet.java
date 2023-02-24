package com.kwhangan2.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Pet {
	
	private String name;
	private int age;

}
