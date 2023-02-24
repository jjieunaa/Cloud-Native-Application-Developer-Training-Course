package com.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Output3 {
	private List<Product> list;
	private File file;
	private PrintWriter writer;
	
	// autoFlush가 true면 자동 출력
	// File을 FileWriter에 넣고 FileWriter를 BufferdWriter에 넣고 BufferedWriter를 printWriter에 넣기
	
	public Output3(List<Product> list) {
		this.list = list;
		this.file = new File("./result.txt");
		try {
		this.writer = new PrintWriter(new BufferedWriter(new FileWriter(this.file, true)), true);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			// this.writer.close();
		}
	}
	
	public void fileOutput3() {	// 파일 출력
		this.printLabel3();	// 파일로 라벨링 출력
		for (Product p : this.list) {
			this.writer.println(p);	// 파일로 출력
		}
	}
	
	private void printLabel3() {	// 파일로 라벨링 출력
		this.writer.println("                             <<상품별 판매 이익금 및 이익율표>>                                  ");
		this.writer.println("-------------------------------------------------------------------------------------------");
		this.writer.println("상품명            수량         판매단가         매입단가         운송료        이익금         이익율");
		this.writer.println("-------------------------------------------------------------------------------------------");
	}
	
	public void output3() {
		this.printLabel();
		for(Product p: this.list) {
			System.out.println(p);	// p.toString()
		}
	}
	
	private void printLabel() {
		System.out.println("                             <<상품별 판매 이익금 및 이익율표>>                                  ");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("상품명            수량         판매단가         매입단가         운송료        이익금         이익율");
		System.out.println("-------------------------------------------------------------------------------------------");		
	}
}
