package com.onlinebank.receiver;

import com.onlinebank.Account;

public interface IReceiver {
	
	/**
	 * 真正执行操作的地方
	 */
	public boolean excute(Account account,int money);
}
