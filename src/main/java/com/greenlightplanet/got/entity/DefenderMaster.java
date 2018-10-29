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
 * Entity to containing information of defender 
 */

@Entity
@Table(name="Defender_master")
public class DefenderMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonIgnore
	private long id;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Battle_Number",referencedColumnName="id")
    private BattleMaster battleNumber;
	
	@Column(name ="Defender1")
	private String defender1;
	
	@Column(name ="Defender2")
	private String defender2;	

	@Column(name ="Defender3")
	private String defender3;

	@Column(name ="Defender4")
	private String defender4;
	
	@Column(name ="Defender_commander")
	private String defenderCommander;

	@Column(name ="Defender_king")
	private String defenderKing;
	
	@Column(name ="Defender_size")
	private int defenderSize;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public BattleMaster getBattleNumber() {
		return battleNumber;
	}

	public void setBattleNumber(BattleMaster battleNumber) {
		this.battleNumber = battleNumber;
	}

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
		return "DefenderMaster [id=" + id + ", battlNumber=" + battleNumber + ", defender1=" + defender1 + ", defender2="
				+ defender2 + ", defender3=" + defender3 + ", defender4=" + defender4 + ", defenderCommander="
				+ defenderCommander + ", defenderKing=" + defenderKing + ", defenderSize=" + defenderSize + "]";
	}

		
}

