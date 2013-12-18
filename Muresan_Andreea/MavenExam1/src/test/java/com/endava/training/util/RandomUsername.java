package com.endava.training.util;

import java.util.Random;

import org.junit.Test;

/**
 * This class contains methods to generate random user names.
 * 
 * @author AnMuresan
 * @version 1.0
 */
public class RandomUsername {

	public String generateRandomUsername() {

		Random random = new Random();
		int rand = random.nextInt(100000);
		String username = "aaaabb" + rand;
		System.out.println("Username : " + username);
		return username;

	}

	@Test
	public void testGenerateEmail() {

		generateRandomUsername();
	}

}
