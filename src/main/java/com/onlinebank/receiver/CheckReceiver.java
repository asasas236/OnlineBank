package com.onlinebank.receiver;

import com.onlinebank.Account;

public class CheckReceiver implements IReceiver{

	@Override
	public boolean excute(Account account,int money) {
		System.out.println("�û�"+account.getUsername()+",ִ���˲�����ѯ���,���Ϊ:"+account.getMoney()+",ʣ��"+account.getDegrees()+"�ȵ�");
		return true;
	}

}
