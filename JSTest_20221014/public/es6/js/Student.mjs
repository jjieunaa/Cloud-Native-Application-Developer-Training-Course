class Student {	
	constructor(no, name, major) {
		this.no = no;
		this.name = name;
		this.major = major;
	}
	
	getNo() {
		return this.no;
	}
	getName() {
		return this.name;
	}
	getMajor() {
		return this.major;
	}
	
	setNo(no) {
		this.no=no;
	}
	setName(name) {
		this.name=name;
	}
	setMajor(major) {
		this.major=major;
	}
}