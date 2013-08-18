package com.onlinebank;

public class Account {
	/**
	 * 多少钱
	 */
	private int money;
	/**
	 * 多少度电
	 */
	private int degrees;
	
	private String username;
	
	public Account(String userName){
		this.username = userName;
	}
	
	public String getUsername() {
		return username;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getDegrees() {
		return degrees;
	}
	public void setDegrees(int degrees) {
		this.degrees = degrees;
	}
	
}
