package com.onlinebank;

import com.onlinebank.command.CommandFactory;

public class User implements Runnable {
	
	private BankServer bankServer;
	/**
	 * 计数器，超过3次余额不足，自动关闭线程。
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
