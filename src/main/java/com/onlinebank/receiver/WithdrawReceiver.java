package com.onlinebank.receiver;

import com.onlinebank.Account;

public class WithdrawReceiver implements IReceiver{

	@Override
	public boolean excute(Account account,int money) {
		if (account.getMoney()>=money) {
			account.setMoney(account.getMoney()-money);
			System.out.println("�û�:"+account.getUsername()+"ȡǮ�ɹ�,���:"+account.getMoney());
			return true;
		}
		System.out.println("�û�:"+account.getUsername()+"ȡǮʧ��,����");
		return false;
	}

}
