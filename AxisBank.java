package com.examplesofoops;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit 3000");
	}

	public static void main(String[] args) {
		AxisBank AB=new AxisBank();
		AB.saving();
		AB.fixed();
		AB.deposit();

	}

}
