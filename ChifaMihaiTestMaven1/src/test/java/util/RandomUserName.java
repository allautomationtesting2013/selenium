package util;

import java.util.Random;

public class RandomUserName  {


public String userNameGenerator(String firstName,String lastName){
		
		Random rand=new Random();
		int nextR=rand.nextInt(1000);
		String  username=firstName+lastName+nextR;
		return username;
				
	}
	
}
