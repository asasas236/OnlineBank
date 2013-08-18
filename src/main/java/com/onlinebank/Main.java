package com.onlinebank;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankServer server = new BankServer();
		for (int i = 0; i < 3; i++) {
			new Thread(new User(server)).start();
		}
	}

}
