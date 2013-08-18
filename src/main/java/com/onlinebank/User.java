package com.onlinebank;

import com.onlinebank.command.CommandFactory;

public class User implements Runnable {
	
	private BankServer bankServer;
	/**
	 * ������������3�����㣬�Զ��ر��̡߳�
	 */
	private int num=0;
	
	public User(BankServer bankServer){
		this.bankServer = bankServer;
	}

	@Override
	public void run() {
		
		while(num<3){
			boolean result = bankServer.services(Thread.currentThread().getName(), CommandFactory.genCommand());
			if (!result) {
				num++;
			}
		}
	}

}
