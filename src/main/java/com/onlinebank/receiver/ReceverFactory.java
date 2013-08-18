package com.onlinebank.receiver;

public class ReceverFactory {
	
	/**
	 * ≤È—Ø”‡∂Ó
	 */
	private static final Class<CheckReceiver> CHECK_BALANCE=CheckReceiver.class;
	/**
	 * ¥Ê«Æ
	 */
	private static final Class<DepositReceiver> DEPOSIT=DepositReceiver.class;
	/**
	 * »°«Æ 
	 */
	private static final Class<WithdrawReceiver> WITHDRAW=WithdrawReceiver.class;
	/**
	 * π∫µÁ
	 */
	private static final Class<ElectricityReceiver> ELECTRICITY=ElectricityReceiver.class;
	/**
	 * √¸¡Ó ˝◊È
	 */
	private static final Class<?>[] commandArray={CHECK_BALANCE,DEPOSIT,WITHDRAW,ELECTRICITY};

	
	public static IReceiver getReceiver(int state){
		try {
			return (IReceiver)commandArray[state].newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("state is error "+state);
	}
}
