package com.onlinebank.receiver;

import com.onlinebank.Account;

public class CheckReceiver implements IReceiver{

	@Override
	public boolean excute(Account account,int money) {
		System.out.println("用户"+account.getUsername()+",执行了操作查询余额,余额为:"+account.getMoney()+",剩余"+account.getDegrees()+"度电");
		return true;
	}

}
