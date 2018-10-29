package com.greenlightplanet.got.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greenlightplanet.got.entity.DefenderMaster;

/*
 * Repository used to perform operations on Defender Table 
 */
@Repository
public interface DefenderMasterRepository extends JpaRepository<DefenderMaster, Long> {

}
