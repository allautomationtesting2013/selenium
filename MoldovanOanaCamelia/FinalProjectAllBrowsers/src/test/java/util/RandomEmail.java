package util;

/**
 * This class implements the generateRandomEmail method 
 */

import java.util.Random;

public class RandomEmail {

	/**
	 * This method generates a random Email
	 * @return email as a random email for each registration
	 */
	public String generateRandomEmail() {

		Random random = new Random();
		int rand = random.nextInt(999999);
		String email = "random@gmail" + rand + ".com";
		return email;
	}
}
