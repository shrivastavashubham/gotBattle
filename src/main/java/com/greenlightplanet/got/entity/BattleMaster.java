package com.greenlightplanet.got.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * Entity to containing information of Battle 
 */

@Entity
@Table(name = "battle_master")
public class BattleMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private long id;

	@Column(name = "battle_Number", nullable = false, unique = true)
	private long battleNumber;

	@Column(name = "type")
	private String type;

	@Column(name = "name")
	private String name;

	@Column(name = "year")
	private long year;

	@Column(name = "attacker_outcome")
	private BattleOutcome attackerOutcome;

	@Column(name = "major_death")
	private int majorDeath;

	@Column(name = "major_Capture")
	private int majorCapture;

	@Column(name = "summer")
	private boolean summer;

	@Column(name = "location")
	private String location;

	@Column(name = "region")
	private String region;

	@Column(name = "notes",length=1000)
	private String notes;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "attacker_Id", nullable = false, referencedColumnName="id")
	private AttackerMaster attackerId;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "defender_Id", nullable = false, referencedColumnName="id")
	private DefenderMaster defenderId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getBattleNumber() {
		return battleNumber;
	}

	public void setBattleNumber(long battleNumber) {
		this.battleNumber = battleNumber;
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

	public AttackerMaster getAttackerId() {
		return attackerId;
	}

	public void setAttackerId(AttackerMaster attackerId) {
		this.attackerId = attackerId;
	}

	public DefenderMaster getDefenderId() {
		return defenderId;
	}

	public void setDefenderId(DefenderMaster defenderId) {
		this.defenderId = defenderId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BattleMaster [id=" + id + ", battleNumber=" + battleNumber + ", type=" + type + ", name=" + name
				+ ", year=" + year + ", attackerOutcome=" + attackerOutcome + ", majorDeath=" + majorDeath
				+ ", majorCapture=" + majorCapture + ", summer=" + summer + ", location=" + location + ", region="
				+ region + ", notes=" + notes + ", attackerId=" + attackerId + ", defenderId=" + defenderId + "]";
	}

}
