package com.greenlightplanet.got.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenlightplanet.got.beans.AtackerBean;
import com.greenlightplanet.got.beans.DefenderBean;
import com.greenlightplanet.got.beans.FullBattleDetails;
import com.greenlightplanet.got.entity.BattleMaster;
import com.greenlightplanet.got.repository.BattleMasterRepository;
import com.greenlightplanet.got.service.BattleDataService;

/*
 * Implementation that contains function declaration for inserting battle related information
 */
@Service
public class BattleDataServiceImpl implements BattleDataService {

	@Autowired
	private BattleMasterRepository battleMasterRepository;

	/*
	 * Method definition Return all the distinct location where battles has been fought
	 */
	@Override
	public List<String> findDistinctLocations() {
		return battleMasterRepository.findDistintLocations();
	}

	/*
	 * Method Definition that Return Data of a particular data corresponding to the battleNumber
	 * takes parameter as battleNumber
	 */
	@Override
	public FullBattleDetails findByBattleNumber(Long battleNumber) {
		BattleMaster battleMaster = battleMasterRepository.findByBattleNumber(battleNumber);
		FullBattleDetails battleDetails = new FullBattleDetails();
		AtackerBean atackerBean = new AtackerBean();
		DefenderBean defenderBean = new DefenderBean();
		try {
			BeanUtils.copyProperties(atackerBean, battleMaster.getAttackerId());
			BeanUtils.copyProperties(defenderBean, battleMaster.getDefenderId());
			BeanUtils.copyProperties(battleDetails, battleMaster);
			battleDetails.setAttacker(atackerBean);
			battleDetails.setDefender(defenderBean);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
		}
		return battleDetails;
	}

	/*
	 * Method definition that Returns total number of battles that has been fought
	 */
	@Override
	public Long numberOfBattles() {

		return battleMasterRepository.countUnique();
	}

}
