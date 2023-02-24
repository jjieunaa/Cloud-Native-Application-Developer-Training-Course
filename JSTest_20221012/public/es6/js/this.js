/*
console.log("1) " + this);	// window

function f() {
	console.log("2) " + this);	// window
}
f();

var person = {
	name:"홍길동",
	age:25,
	getName: function() {
		console.log("3) " + this);	// object
		return this.name;
	}
};
person.getName();
// person은 생성자 아니고 객체임
// 생성자는 function을 사용하여 만들어야 됨

console.log("4) " + typeof this);
console.log("5) " + person instanceof Object);
console.log("6) " + this instanceof Window);
*/


// DOM Event handling
// Event, Event Target, Event Handler (= Event callback function)
// click: Event, onclick: Event Attribute
/*
function clickLog() {
	console.log("버튼이 클릭되었습니다!");
}
window.onload = function() {
	let btn = document.getElementById("btn");
	btn.addEventListener("click", clickLog);
	let btn2 = document.getElementById("btn2");
	btn2.addEventListener("click", function() {
		btn.removeEventListener("click", clickLog)
	});
}
*/


window.addEventListener("load", function() {
	let btn = document.getElementById("btn");
	btn.addEventListener("click", function() {
		console.log(this);
	});
});

/* JQuery 방식
$(function() {
	$("btn").click(function() {
	});
});
*/