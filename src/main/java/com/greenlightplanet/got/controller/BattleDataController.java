package com.greenlightplanet.got.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.greenlightplanet.got.beans.FullBattleDetails;
import com.greenlightplanet.got.service.BattleDataService;


/*
 * Controller to get Various Data of Battle Information
 */
@RestController
public class BattleDataController {

	@Autowired
	BattleDataService battleDataService;

	/*
	 * API end point that Return all the distinct location where battles has been fought
	 */
	@GetMapping(value = "/distinctLocations")
	public List<String> getAllLocations() {
		return battleDataService.findDistinctLocations();
	}

	/*
	 * API end point that Return Data of a particular data corresponding to the battleNumber
	 * takes parameter as battleNumber
	 */
	@GetMapping(value = "/getByBattleNumber")
	public FullBattleDetails getBattleByBattleNumber(@RequestHeader(name = "battleNumber") long battleNumber) {
		return battleDataService.findByBattleNumber(battleNumber);
	}

	
	/*
	 * API end point that Returns total number of battles that has been fought
	 */
	@GetMapping(value = "/totalBattleCounts")
	public Map<String, Long> TotalBattleCount() {
		Map<String, Long> response = new HashMap<String, Long>();
		response.put("Number of battles ", battleDataService.numberOfBattles());
		return response;

	}
}
