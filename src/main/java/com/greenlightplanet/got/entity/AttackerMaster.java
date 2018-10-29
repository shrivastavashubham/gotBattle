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
 * Entity to containing information of attacker 
 */

@Entity
@Table(name="Attacker_master")
public class AttackerMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
	private long id;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "battle_number_id", referencedColumnName="id")
    private BattleMaster battleNumber;
	
	@Column(name ="attacker1")
	private String attacker1;
	
	@Column(name ="attacker2")
	private String attacker2;	

	@Column(name ="attacker3")
	private String attacker3;

	@Column(name ="attacker4")
	private String attacker4;
	
	@Column(name ="attacker_commander")
	private String attackerCommander;

	@Column(name ="attacker_king")
	private String attackerKing;
	
	@Column(name ="attacker_size")
	private int attackerSize;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public int getAttacker() {
		return attackerSize;
	}

	public void setAttacker(int attacker) {
		this.attackerSize = attacker;
	}

	public BattleMaster getBattlNumber() {
		return battleNumber;
	}

	public void setBattlNumber(BattleMaster battlNumber) {
		this.battleNumber = battlNumber;
	}
	
	
	
	
}
