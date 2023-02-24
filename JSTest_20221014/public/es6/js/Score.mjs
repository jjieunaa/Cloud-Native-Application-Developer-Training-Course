class Score {	
	constructor(kor, eng, math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	getKor() {
		return this.kor;
	}
	getEng() {
		return this.eng;
	}
	getMath() {
		return this.math;
	}
	
	setKor(kor) {
		this.kor = kor;
	}
	setEng(eng) {
		this.eng= eng;
	}
	setMath(math) {
		this.math = math;
	}
}