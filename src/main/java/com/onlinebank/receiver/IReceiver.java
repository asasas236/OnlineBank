package com.onlinebank.receiver;

import com.onlinebank.Account;

public interface IReceiver {
	
	/**
	 * ����ִ�в����ĵط�
	 */
	public boolean excute(Account account,int money);
}
