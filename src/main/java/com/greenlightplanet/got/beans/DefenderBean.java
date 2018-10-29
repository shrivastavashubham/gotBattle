package com.greenlightplanet.got.beans;


/*
 * Bean Used to store Defender Information for Response
 */
public class DefenderBean {

	private String defender1;

	private String defender2;

	private String defender3;

	private String defender4;

	private String defenderCommander;

	private String defenderKing;

	private int defenderSize;

	public String getDefender1() {
		return defender1;
	}

	public void setDefender1(String defender1) {
		this.defender1 = defender1;
	}

	public String getDefender2() {
		return defender2;
	}

	public void setDefender2(String defender2) {
		this.defender2 = defender2;
	}

	public String getDefender3() {
		return defender3;
	}

	public void setDefender3(String defender3) {
		this.defender3 = defender3;
	}

	public String getDefender4() {
		return defender4;
	}

	public void setDefender4(String defender4) {
		this.defender4 = defender4;
	}

	public String getDefenderCommander() {
		return defenderCommander;
	}

	public void setDefenderCommander(String defenderCommander) {
		this.defenderCommander = defenderCommander;
	}

	public String getDefenderKing() {
		return defenderKing;
	}

	public void setDefenderKing(String defenderKing) {
		this.defenderKing = defenderKing;
	}

	public int getDefenderSize() {
		return defenderSize;
	}

	public void setDefenderSize(int defenderSize) {
		this.defenderSize = defenderSize;
	}

	@Override
	public String toString() {
		return "DefenderBean [defender1=" + defender1 + ", defender2=" + defender2 + ", defender3=" + defender3
				+ ", defender4=" + defender4 + ", defenderCommander=" + defenderCommander + ", defenderKing="
				+ defenderKing + ", defenderSize=" + defenderSize + "]";
	}

}
