package com.greenlightplanet.got.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.greenlightplanet.got.entity.BattleMaster;

/*
 * Repository used to perform operations on BattleMaster Table 
 */
@Repository
public interface BattleMasterRepository extends JpaRepository<BattleMaster, Long> {

	/*
	 * Returns Distinct locations  
	 */
	@Query("Select distinct s.location from BattleMaster s where s.location is not null")
	List<String> findDistintLocations();

	/*
	 * find all information of battle by battleNumber 
	 */
	BattleMaster findByBattleNumber(long battleNumber);
	
	/*
	 * Return distinct number of battles 
	 */
	@Query("select distinct count(c) from BattleMaster c")
	Long countUnique();
}
