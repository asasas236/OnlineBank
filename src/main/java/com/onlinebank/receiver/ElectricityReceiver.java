package com.onlinebank.receiver;

import com.onlinebank.Account;

public class ElectricityReceiver implements IReceiver {

	@Override
	public boolean excute(Account account,int money) {
		account.setDegrees(account.getDegrees()+money/2);
		System.out.println("用户:"+account.getUsername()+"买电成功,剩余"+account.getDegrees()+"度电");
		return true;
	}

}
