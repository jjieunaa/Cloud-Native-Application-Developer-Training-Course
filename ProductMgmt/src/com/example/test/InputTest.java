package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.Input;
import com.example.Product;

public class InputTest {

	@Test
	public void test() {
		Product [] array = new Product[7];
		Input input = new Input(array);		// Input class의 생성자 호출
		input.fileInput();	// 파일 입력 끝
		// assertEquals("PAPER", array[6].getName());
		assertEquals(2000, array[0].getTransport());	// NOTEBOOK의 운송료
	}

}
