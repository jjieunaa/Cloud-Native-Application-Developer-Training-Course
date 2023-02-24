package com.example;

public class Calc {
	private Product [] array;

	public Calc(Product[] array) {
		this.array = array;
	}
	
	public void calc() {
		for(Product p: this.array) {
			int selmoney = p.getSu() * p.getSelprice();	// 판매금액 = 수량 * 판매단가
			int buymoney = p.getSu() * p.getBuyprice();	// 매입금액 = 수량 * 매입단가
			int money = selmoney - (buymoney + p.getTransport());	// 이익금 =판매금액 - (매입금액 + 운송료)
			double rate = (double)money / buymoney * 100;	// 이익율 = 이익금 / 매입금액 * 100
			p.setMoney(money);	// 이익금 세팅
			p.setRate(rate);	// 이익률 세팅
		}
	}
	
}
