package com.example;

public class Product {
	private String name;
	private int su, buyprice, selprice, transport, money;
	private double rate;
	
	public Product(String name, int su, int selprice, int buyprice, int transport) {	// Constructor
		this.name = name;
		this.su = su;
		this.buyprice = buyprice;
		this.selprice = selprice;
		this.transport = transport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getBuyprice() {
		return buyprice;
	}

	public void setBuyprice(int buyprice) {
		this.buyprice = buyprice;
	}

	public int getSelprice() {
		return selprice;
	}

	public void setSelprice(int selprice) {
		this.selprice = selprice;
	}

	public int getTransport() {
		return transport;
	}

	public void setTransport(int transport) {
		this.transport = transport;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return String.format("%-10s%,7d%,7d%,7d%,7d%,15d%,10.2f\n",
				name, su, selprice, buyprice, transport, money, rate);
	}
}
