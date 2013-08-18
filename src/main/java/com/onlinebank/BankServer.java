package com.onlinebank;

import java.util.concurrent.ConcurrentHashMap;

import com.onlinebank.command.Command;

public class BankServer {
		
	private static ConcurrentHashMap<String, Account> accountMap = new ConcurrentHashMap<>();
	
	public boolean services(String id,Command command){
		accountMap.putIfAbsent(id, new Account(id));
		return command.excuteCommand(accountMap.get(id));
	}
	
	
}
