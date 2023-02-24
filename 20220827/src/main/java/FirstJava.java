
public class FirstJava {
	public static void main(String[] args) {
		double avg = 89.5;
		long value1 = Double.doubleToRawLongBits(avg);
		System.out.println(Long.toBinaryString(value1));
		// 89.5를 메모리에 이진수로 저장
		// 기본 타입
	}
}
