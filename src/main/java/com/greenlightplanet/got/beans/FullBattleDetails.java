package com.greenlightplanet.got.beans;

import com.greenlightplanet.got.entity.BattleOutcome;


/*
 * Bean Used to store Full Battle Information for Response
 */
public class FullBattleDetails {

	private long battleNumber;

	private String type;

	private String name;

	private long year;

	private BattleOutcome attackerOutcome;

	private int majorDeath;

	private int majorCapture;

	private boolean summer;

	private String location;

	private String region;

	private String notes;

	private AtackerBean attacker;

	private DefenderBean defender;

	public long getBattleNumber() {
		return battleNumber;
	}

	public void setBattleNumber(long battleNumber) {
		this.battleNumber = battleNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public BattleOutcome getAttackerOutcome() {
		return attackerOutcome;
	}

	public void setAttackerOutcome(BattleOutcome attackerOutcome) {
		this.attackerOutcome = attackerOutcome;
	}

	public int getMajorDeath() {
		return majorDeath;
	}

	public void setMajorDeath(int majorDeath) {
		this.majorDeath = majorDeath;
	}

	public int getMajorCapture() {
		return majorCapture;
	}

	public void setMajorCapture(int majorCapture) {
		this.majorCapture = majorCapture;
	}

	public boolean isSummer() {
		return summer;
	}

	public void setSummer(boolean summer) {
		this.summer = summer;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public AtackerBean getAttacker() {
		return attacker;
	}

	public void setAttacker(AtackerBean attacker) {
		this.attacker = attacker;
	}

	public DefenderBean getDefender() {
		return defender;
	}

	public void setDefender(DefenderBean defender) {
		this.defender = defender;
	}

	@Override
	public String toString() {
		return "FullBattleDetails [battleNumber=" + battleNumber + ", type=" + type + ", name=" + name + ", year="
				+ year + ", attackerOutcome=" + attackerOutcome + ", majorDeath=" + majorDeath + ", majorCapture="
				+ majorCapture + ", summer=" + summer + ", location=" + location + ", region=" + region + ", notes="
				+ notes + ", attacker=" + attacker + ", defender=" + defender + "]";
	}

	

}
