package com.example;

public class Main {
	public static void main(String[] args) {
		Product [] array = new Product[7];
		Input input = new Input(array);
		input.fileInput();
		
		Calc calc = new Calc(array);
		calc.calc();
		
		Sort sort = new Sort(array);
		sort.sort();
		
		Output output = new Output(array);
		output.output();	// 화면 출력
	}
}
