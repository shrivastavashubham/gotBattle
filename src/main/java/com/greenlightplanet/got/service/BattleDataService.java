package com.greenlightplanet.got.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greenlightplanet.got.beans.FullBattleDetails;

/*
 * Interface that contains function declaration for retrieving battle related information
 */
@Service
public interface BattleDataService {
	/*
	 * Method Declaration Return all the distinct location where battles has been fought
	 */
	public List<String> findDistinctLocations();

	/*
	 * Method Declaration that Return Data of a particular data corresponding to the battleNumber
	 * takes parameter as battleNumber
	 */
	public FullBattleDetails findByBattleNumber(Long battleNumber);
	
	/*
	 * Method declaration Returns total number of battles that has been fought
	 */
	public Long numberOfBattles();
}
