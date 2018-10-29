package com.greenlightplanet.got.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greenlightplanet.got.entity.AttackerMaster;

/*
 * Repository used to perform operations on AttackerMaster Table 
 */

@Repository
public interface AttackerMasterRepository extends JpaRepository<AttackerMaster, Long>{
	
	

}
