package com.onlinebank.receiver;

import com.onlinebank.Account;

public class DepositReceiver implements IReceiver {

	@Override
	public boolean excute(Account account,int money) {
		account.setMoney(account.getMoney()+money);
		System.out.println("�û�:"+account.getUsername()+"��Ǯ�ɹ�,���"+account.getMoney());
		return true;
	}

}
