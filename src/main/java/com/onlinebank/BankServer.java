package com.onlinebank;

import java.util.concurrent.ConcurrentHashMap;

import com.onlinebank.command.ICommand;

public class BankServer {
		
	private static ConcurrentHashMap<String, Account> accountMap = new ConcurrentHashMap<>();
	
	public boolean services(String id,ICommand command){
		accountMap.putIfAbsent(id, new Account(id));
		return command.excuteCommand(accountMap.get(id));
	}
	
	
}
