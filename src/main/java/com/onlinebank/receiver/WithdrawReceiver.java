package com.onlinebank.receiver;

import com.onlinebank.Account;

public class WithdrawReceiver implements IReceiver{

	@Override
	public boolean excute(Account account,int money) {
		if (account.getMoney()>=money) {
			account.setMoney(account.getMoney()-money);
			System.out.println("用户:"+account.getUsername()+"取钱成功,余额:"+account.getMoney());
			return true;
		}
		System.out.println("用户:"+account.getUsername()+"取钱失败,余额不足");
		return false;
	}

}
