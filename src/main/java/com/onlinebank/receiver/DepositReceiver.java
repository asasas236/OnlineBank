package com.onlinebank.receiver;

import com.onlinebank.Account;

public class DepositReceiver implements IReceiver {

	@Override
	public boolean excute(Account account,int money) {
		account.setMoney(account.getMoney()+money);
		System.out.println("用户:"+account.getUsername()+"存钱成功,余额"+account.getMoney());
		return true;
	}

}
