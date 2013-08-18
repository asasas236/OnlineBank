package com.onlinebank.command;

import com.onlinebank.Account;
import com.onlinebank.receiver.IReceiver;
import com.onlinebank.receiver.ReceverFactory;

public class Command implements ICommand{
	/**
	 *  ≤√¥√¸¡Ó
	 */
	private int state;
	/**
	 * «Æ
	 */
	private int money;
	
	private IReceiver receiver;
	
	public Command(int state,int money){
		this.state = state;
		this.money = money;
		this.receiver = ReceverFactory.getReceiver(state);   
	}
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public boolean excuteCommand(Account account) {
		return receiver.excute(account,money);
	}
	
}
