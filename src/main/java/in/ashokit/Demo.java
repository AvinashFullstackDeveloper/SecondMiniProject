package in.ashokit;

import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		System.out.println(generateRandomPwd());
	}
	
	public static String generateRandomPwd() {
		int leftLimit = 48; // numeral '0'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 6;
		Random random = new Random();
		String generatedString = random.ints(leftLimit, rightLimit + 1) .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
		. limit(targetStringLength)
		.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		. toString();

		return generatedString;
}
}
