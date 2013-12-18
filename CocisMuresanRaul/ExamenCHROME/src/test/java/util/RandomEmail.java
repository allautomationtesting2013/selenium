package util;

import java.util.Random;

import org.junit.Test;

/**
 * Clasa RandomEmail implementeaza metoda generateRandomEmail
 * @author rcocismuresan
 * @version 1.0
 */
public class RandomEmail {

	
	/**
	 * Metoda genereaza adrese de mail
	 * @return email
	 */
	public String generateRandomEmail() {

		Random random = new Random();
		int rand = random.nextInt(100000);
		String email = "araaaulll@raul" + rand + ".com";
		System.out.println("Email : " + email);
		return email;

	}

	@Test
	public void testGenerateEmail() {

		generateRandomEmail();
	}

}
