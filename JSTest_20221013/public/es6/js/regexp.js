window.onload = function() {
	
	let ipaddress = document.getElementById("ipaddress");
	let koreaid = document.getElementById("koreaid");
	let cpnum = document.getElementById("cpnum");
	let yok = document.getElementById("yok");
	let macaddress = document.getElementById("macaddress");
	let isbn = document.getElementById("isbn");
	
	let ipaddressBtn = document.getElementById("ipaddressBtn");
	let koreaidBtn = document.getElementById("koreaidBtn");
	let cpnumBtn = document.getElementById("cpnumBtn");
	let yokBtn = document.getElementById("yokBtn");
	let macaddressBtn = document.getElementById("macaddressBtn");
	let isbnBtn = document.getElementById("isbnBtn");
	
	ipaddressBtn.addEventListener("click", function() {
		// ㅁㅁㅁ.ㅁㅁㅁ.ㅁㅁㅁ.ㅁㅁㅁ
		// ㅁ 모두 숫자
		// 각 ㅁㅁㅁ는 0~255까지의 숫자
		let ipaddressRegExp = /^((\d|[1-9]\d|1\d{2}|2[0-4]\d|25[0-5])\.){3}(\d|[1-9]\d|1\d{2}|2[0-4]\d|25[0-5])$/;
		console.log(ipaddressRegExp.test(ipaddress.value));
	});
	
	koreaidBtn.addEventListener("click", function() {
		// ㅁㅁㅁㅁㅁㅁ-ㅁㅁㅁㅁㅁㅁㅁ
		// ㅁ 모두 숫자
		// 3~4번째는 월(01~12)
		// 5~6번째는 일(01~31)
		// - 바로 뒤의 ㅁ는 1~4 숫자 중 하나
		let koreaidRegExp = /^\d{2}(0[1-9]|1[0-2])(0[1-9]|[1-2]\d|3[0-1])-[1-4]\d{6}$/;
		console.log(koreaidRegExp.test(koreaid.value));
	});
	
	cpnumBtn.addEventListener("click", function() {
		// ㅁㅁㅁ-ㅁㅁㅁㅁ-ㅁㅁㅁㅁ
		// ㅁ 모두 숫자
		// 1~3번째는 010 또는 011
		let cpnumRegExp = /^01[0-1]-\d{4}-\d{4}$/;
		console.log(cpnumRegExp.test(cpnum.value));
	});
	
	yokBtn.addEventListener("click", function() {
		// 바보, 멍청이, 똥개는 허용하지 않는다.
		let yokRegExp = /[바보|멍청이|똥개]/;
		// let yokRegExp = /바보+|멍청이+|똥개+/;
		console.log(yokRegExp.test(yok.value));
	});
	
	// 1) 48bit(8byte) MAC Address
	macaddressBtn.addEventListener("click", function() {
		// 16진수 1개 = 0~9 or a(A)~f(F)
		// 대소문자 구별 안함
		// 16진수2개-16진수2개-16진수2개-16진수2개-16진수2개-16진수2개
		let macaddressRegExp = /^(\d|[a-fA-F]{2}-){5}(\d|[a-fA-F]{2})$/;
		console.log(macaddressRegExp.test(macaddress.value));
	});
		
	// 2) ISBN 패턴
	isbnBtn.addEventListener("click", function() {
		// 대소문자 구별 안함
		// 숫자4자리(년도): 1900~2022
		// ISBN>공백문자1개>숫자3자리-숫자2자리-숫자1자리-숫자4자리(년도)>공백문자1개>숫자2자리
		let isbnRegExp = /^(ISBN)\s\d{3}-\d{2}-\d-(1\d{3}|20[0-1]\d|202[0-2])\s\d{2}$/;
		console.log(isbnRegExp.test(isbn.value));
	});
		
}