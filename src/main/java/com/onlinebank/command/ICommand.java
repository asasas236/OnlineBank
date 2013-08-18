package com.onlinebank.command;

import com.onlinebank.Account;

public interface ICommand {

	
	public boolean excuteCommand(Account account);
}
