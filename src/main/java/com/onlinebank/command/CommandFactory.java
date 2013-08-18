package com.onlinebank.command;

import java.util.Random;

public class CommandFactory {

	public static Command genCommand(){
		Random random = new Random();
		int state = random.nextInt(4);
		int money = state>0?1000:0;
		Command command = new Command(state,money);
		return command;
	}
}
