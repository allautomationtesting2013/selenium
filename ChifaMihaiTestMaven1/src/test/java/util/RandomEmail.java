package util;

import java.util.Random;

public class RandomEmail {
public String EmailGenerator(){
		
		Random rand=new Random();
		int nextR=rand.nextInt(1000);
		String  email="email"+nextR+"@yemail.com";
		return email;
				
	}
}
