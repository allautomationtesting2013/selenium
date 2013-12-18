package util;

/**
 * This class RandomEmail generates random email
 */
import java.util.Random;

import org.junit.Test;

public class RandomEmail {

	public String generateRandomEmail() {

		Random random = new Random();
		int rand = random.nextInt(100000);
		String email = "llabab@am" + rand + ".com";
		System.out.println("Email: " + email);
		return email;
	}

	@Test
	public void TestGenerateEmail() {
		generateRandomEmail();
	}
}
