
public class FourthJava {
	public static void main(String[] args) {
		String first = "Hello";		// 1000번지
		String second = "World";	// 2000번지
		// String result = first + second;
		String result = first.concat(second);	// 3000번지
		System.out.println("result = " + result);
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("World");
		sb.append(sb1);
		System.out.println("sb = " + sb.toString());
		
		String sql = "SELECT zipcode, sido, gugun, dong, bunji" +
					"FROM zipcode" +
					"WHERE dong = % " + "해운대동" + "%";
		StringBuffer sql = 
	}
}
