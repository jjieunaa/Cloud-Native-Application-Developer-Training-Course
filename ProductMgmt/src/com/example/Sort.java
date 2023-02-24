package com.example;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
	private Product [] array;
	
	public Sort(Product[] array) {
		this.array = array;
	}

	public void sort() {

		Arrays.sort(array, new Comparator<Product>() {
			@Override
			public int compare(Product front, Product back) {
				return (int) (back.getRate() - front.getRate());	// 내림차순
				}
			});
	}
}
