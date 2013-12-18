package com.endava.training.util;

import java.util.Random;

import org.junit.Test;

/**
 * This class contains methods to generate random email addresses.
 * 
 * @author AnMuresan
 * @version 1.0
 */
public class RandomEmail {

	public String generateRandomEmail() {

		Random random = new Random();
		int rand = random.nextInt(100000);
		String email = "aaaa@aaa" + rand + ".com";
		System.out.println("Email : " + email);
		return email;

	}

	@Test
	public void testGenerateEmail() {

		generateRandomEmail();
	}

}
