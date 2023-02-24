"use strict";
function print(no, scope, str) {
	console.log(no+") " +scope+ " scope > this: " +str);
}

window.onload = function() {
	print(1, "global", this);
	
	function f1() {
		print(2, "function", this);
	};
	f1();
	
	var f2 = function() {
		print(3, "function", this);
	};
	f2();
	
	{
		print(4, "block", this);
	}
	
	let obj1 = {
		name: "",
		getName: function() {
			print(5, "object", this);
		}
	};
	obj1.getName();
	
	document.getElementById("btn").addEventListener("click", function() {
		print(6, "event", this);
	});
}

// 객체 바인딩
// 바인딩 스코프를 변경한다.
const person1 = {
	name: "징기스칸",
	getName: function(name1, name2) {
		print(7, "binding object", this);
		return this.name + " " + name1 + " " + name2;
	}
}

const person2 = {
	name: "강감찬"
}

console.log(person1.getName.bind(person2)("이순신", "세종대왕"));	// () 안써주면 함수 자체, () 써주면 함수 호출
console.log(person1.getName.call(person2, "유관순", "안중근"));
console.log(person1.getName.apply(person2, ["권율", "최영"]));