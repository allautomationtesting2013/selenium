package util;

import java.util.Random;

import org.junit.Test;

/**
 * This class is used for generating random email addresses for
 * TestRegisterVMware.
 * 
 * @author Alexandra Perja
 * 
 */
public class RandomEmail {

	public String generateRandomEmail() {

		Random random = new Random();
		int rand = random.nextInt(100000);
		String Email = "aaaa@aaa" + rand + ".com";
		System.out.println("Email : " + Email);
		return Email;

	}

	@Test
	public void testGenerateEmail() {

		generateRandomEmail();
	}

}
