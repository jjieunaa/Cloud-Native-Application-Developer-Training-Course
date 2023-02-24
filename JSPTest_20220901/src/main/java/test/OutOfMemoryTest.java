package test;

public class OutOfMemoryTest {
	
	static String str = null;
	
	public static void main(String[] args) {
		
		OutOfMemoryTest test = null;
		
		for (int i=0; i<1000000; i++) {
			str += "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
			System.out.println(str);
			test = new OutOfMemoryTest();
		}
		
		while (true) {
			new OutOfMemoryTest();
		}
	}
}
