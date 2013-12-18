package util;
/**
 * @author Nina
 * this class calls RandomEmail() method
 */
import java.util.Random;

public class RandomEmail {

	/**
	 * @method generate an unique email
	 * @return email
	 */
	public String generateRandomEmail() {

		Random random = new Random();
		int rand = random.nextInt(100000);
		String email = "aaaa@aaa" + rand + ".com";
		System.out.println("Email : " + email);
		return email;
	}
}
