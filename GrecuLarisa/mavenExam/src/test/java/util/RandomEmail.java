package util;

import java.util.Random;

import org.junit.Test;

/**
 * 
 * @author larisa 
 * this class contains the method 'generateRandomEmail' that
 *         creates random emails used to complete the register Form Page
 */
public class RandomEmail {

	public String generateRandomEmail() {

		Random random = new Random();
		int rand = random.nextInt(100000);
		String email = "bbc@bbc" + rand + ".com";
		System.out.println("Email : " + email);

		return email;

	}

	/**
	 * this method calls the previous method that creates random emails
	 */
	
	@Test
	public void testGenerateEmail() {

		generateRandomEmail();
	}

}
