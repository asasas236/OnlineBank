package com.onlinebank.receiver;

import com.onlinebank.Account;

public class ElectricityReceiver implements IReceiver {

	@Override
	public boolean excute(Account account,int money) {
		account.setDegrees(account.getDegrees()+money/2);
		System.out.println("�û�:"+account.getUsername()+"���ɹ�,ʣ��"+account.getDegrees()+"�ȵ�");
		return true;
	}

}
