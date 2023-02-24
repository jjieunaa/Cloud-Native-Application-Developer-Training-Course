"use strict";

const person1 = {
	name: "홍길동",
	age: 30,
	getName: function() {
		return this.name;
	},
	getAge: function() {
		return this.age;
	}
};

const person2 = {
	name: "강감찬",
	age: 100,
	getName: function() {
		return this.name;
	},
	getAge: function() {
		return this.age;
	}
};

console.log(person1.getName());
console.log(person1.getAge());

console.log(person1.getName.bind(person2)());
console.log(person1.getAge.bind(person2)());

console.log(person2.getName.bind(person1)());
console.log(person2.getAge.bind(person1)());

// call: 바인딩시 데이터를 인자로 전달
function Product(name, price) {
	this.name = name;
	this.price = price;
}

function Food(name, price) {
	Product.call(this, name, price);
	this.category = 'food';
}

console.log(new Food('cheese', 5).name);

// apply: 바인딩시 데이터를 배열로 전달
const numbers = [5, 6, 2, 3, 7];

const max = Math.max.apply(null, numbers);
console.log(max);

const min = Math.min.apply(null, numbers);
console.log(min);

// bind: 바인딩
const module = {
	x: 42,
	getX: function() {
		return this.x;
	}
};

const unboundGetX = module.getX;
console.log(unboundGetX());

const boundGetX = unboundGetX.bind(module);
console.log(boundGetX());