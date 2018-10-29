package com.greenlightplanet.got.beans;


/*
 * Bean Used to store Attacker Information for Response
 */
public class AtackerBean {

	private String attacker1;
	
	private String attacker2;	

	private String attacker3;

	private String attacker4;
	
	private String attackerCommander;

	private String attackerKing;
	
	private int attackerSize;

	public String getAttacker1() {
		return attacker1;
	}

	public void setAttacker1(String attacker1) {
		this.attacker1 = attacker1;
	}

	public String getAttacker2() {
		return attacker2;
	}

	public void setAttacker2(String attacker2) {
		this.attacker2 = attacker2;
	}

	public String getAttacker3() {
		return attacker3;
	}

	public void setAttacker3(String attacker3) {
		this.attacker3 = attacker3;
	}

	public String getAttacker4() {
		return attacker4;
	}

	public void setAttacker4(String attacker4) {
		this.attacker4 = attacker4;
	}

	public String getAttackerCommander() {
		return attackerCommander;
	}

	public void setAttackerCommander(String attackerCommander) {
		this.attackerCommander = attackerCommander;
	}

	public String getAttackerKing() {
		return attackerKing;
	}

	public void setAttackerKing(String attackerKing) {
		this.attackerKing = attackerKing;
	}

	public int getAttackerSize() {
		return attackerSize;
	}

	public void setAttackerSize(int attackerSize) {
		this.attackerSize = attackerSize;
	}

	@Override
	public String toString() {
		return "AtackerBean [attacker1=" + attacker1 + ", attacker2=" + attacker2 + ", attacker3=" + attacker3
				+ ", attacker4=" + attacker4 + ", attackerCommander=" + attackerCommander + ", attackerKing="
				+ attackerKing + ", attackerSize=" + attackerSize + "]";
	}

	
}
