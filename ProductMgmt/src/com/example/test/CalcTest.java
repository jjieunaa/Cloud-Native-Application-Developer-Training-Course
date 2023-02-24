package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.example.Calc;
import com.example.Input;
import com.example.Product;

public class CalcTest {
	private Product [] array;
	
	@Before
	public void init() {
		array = new Product[7];
		Input input = new Input(array);
		input.fileInput();	// 7개의 제품 모두 배열처리 끝
		Calc calc = new Calc(array);
		calc.calc();	// 7개의 제품 계산 끝
	}
	
	@Test
	public void test() {	
		assertNotNull(array[0]);
	}
	
	@Test
	public void test1() {	
		assertEquals(10798000, array[0].getMoney());	// 이익금 테스트
	}

}
