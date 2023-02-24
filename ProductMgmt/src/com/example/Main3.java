package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		Input3 input3 = new Input3(list);
		input3.fileInput3();
		
		Calc3 calc3 = new Calc3(list);
		calc3.calc();
		
		Sort3 sort3 = new Sort3(list);
		sort3.sort3();
		
		Output3 output3 = new Output3(list);
		// output3.output3();	// 화면 출력
		output3.fileOutput3();	// 파일 출력
		System.out.println("File Output Success.");
	}
}
