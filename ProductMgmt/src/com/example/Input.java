package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Product [] array;
	private File file;
	private Scanner sc;
	
	public Input(Product [] array) {	// Constructor: member variable 초기화
		this.array = array;
		this.file = new File("C:/Temp/productdata.txt");
		try {
			this.sc = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			return;
		}
	}
		
	public void fileInput() {
		int count = 0;
		while(this.sc.hasNextLine()) {
			String line = this.sc.nextLine();
			// System.out.println(line);	// NOTEBOOK	36000	5000	4700	2000
			/*
			 * String class split()
			 * Scanner class
			 * StringTokenizer class
			 */
			Scanner myscan = new Scanner(line).useDelimiter("\\s+");
			String name = myscan.next();	// 상품이름
			int su = myscan.nextInt();	// 수량
			int selprice = myscan.nextInt();	// 판매단가
			int buyprice = myscan.nextInt();	// 매입단가
			int transport = myscan.nextInt();	// 운송료
			Product p = new Product(name, su, selprice, buyprice, transport);
			this.array[count] = p;
			count++;
		}
	}
}
