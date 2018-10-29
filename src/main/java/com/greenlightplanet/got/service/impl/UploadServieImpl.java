package com.greenlightplanet.got.service.impl;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.greenlightplanet.got.entity.AttackerMaster;
import com.greenlightplanet.got.entity.BattleMaster;
import com.greenlightplanet.got.entity.BattleOutcome;
import com.greenlightplanet.got.entity.DefenderMaster;
import com.greenlightplanet.got.repository.AttackerMasterRepository;
import com.greenlightplanet.got.repository.BattleMasterRepository;
import com.greenlightplanet.got.repository.DefenderMasterRepository;
import com.greenlightplanet.got.service.UploadService;

/*
 * Implementation that contains function declaration for inserting battle related information
 */
@Service
public class UploadServieImpl implements UploadService {

	@Autowired
	BattleMasterRepository battleMasterRepository;

	@Autowired
	AttackerMasterRepository attackerMasterRepository;

	@Autowired
	DefenderMasterRepository defenderMasterRepository;

	
	/*
	 * Method definition 
	 * which is used to store data of battles using CSV file takes CSV
	 * file as an input return all the data that has been saved
	 */
	@Override
	public List<BattleMaster> uploadCsv(MultipartFile file) {
		List<BattleMaster> listOfBattleMaster = new ArrayList<>();
		try {
			Reader reader = new InputStreamReader(file.getInputStream());
			@SuppressWarnings("resource")
			CSVParser csvParser = new CSVParser(reader,
					CSVFormat.DEFAULT.withHeader("name", "year", "battle_number", "attacker_king", "defender_king",
							"attacker_1", "attacker_2", "attacker_3", "attacker_4", "defender_1", "defender_2",
							"defender_3", "defender_4", "attacker_outcome", "battle_type", "major_death",
							"major_capture", "attacker_size", "defender_size", "attacker_commander",
							"defender_commander", "summer", "location", "region", "note").withIgnoreHeaderCase()
							.withTrim());

			Iterator<CSVRecord> i = csvParser.iterator();
			i.next();
			while (i.hasNext()) {
				CSVRecord battleInfo = i.next();
				BattleMaster battleMaster = new BattleMaster();
				AttackerMaster attackerMaster = new AttackerMaster();
				DefenderMaster defenderMaster = new DefenderMaster();
				battleMaster.setName(battleInfo.get(0));
				battleMaster.setYear(Integer.parseInt(battleInfo.get(1)));
				battleMaster.setBattleNumber(Integer.parseInt(battleInfo.get(2)));
				if (Objects.nonNull(battleInfo.get(3)) && !battleInfo.get(3).equals(""))
					attackerMaster.setAttackerKing(battleInfo.get(3));
				if (Objects.nonNull(battleInfo.get(4)) && !battleInfo.get(4).equals(""))
					defenderMaster.setDefenderKing(battleInfo.get(4));
				if (Objects.nonNull(battleInfo.get(5)) && !battleInfo.get(5).equals(""))
					attackerMaster.setAttacker1(battleInfo.get(5));
				if (Objects.nonNull(battleInfo.get(6)) && !battleInfo.get(6).equals(""))
					attackerMaster.setAttacker2(battleInfo.get(6));
				if (Objects.nonNull(battleInfo.get(7)) && !battleInfo.get(7).equals(""))
					attackerMaster.setAttacker3(battleInfo.get(7));
				if (Objects.nonNull(battleInfo.get(8)) && !battleInfo.get(8).equals(""))
					attackerMaster.setAttacker4(battleInfo.get(8));
				if (Objects.nonNull(battleInfo.get(9)) && !battleInfo.get(9).equals(""))
					defenderMaster.setDefender1(battleInfo.get(9));
				if (Objects.nonNull(battleInfo.get(10)) && !battleInfo.get(10).equals(""))
					defenderMaster.setDefender2(battleInfo.get(10));
				if (Objects.nonNull(battleInfo.get(11)) && !battleInfo.get(11).equals(""))
					defenderMaster.setDefender3(battleInfo.get(11));
				if (Objects.nonNull(battleInfo.get(12)) && !battleInfo.get(12).equals(""))
					defenderMaster.setDefender4(battleInfo.get(12));
				if (Objects.nonNull(battleInfo.get(13)) && !battleInfo.get(13).equals(""))
					battleMaster.setAttackerOutcome(BattleOutcome.valueOf(battleInfo.get(13).toUpperCase()));
				if (Objects.nonNull(battleInfo.get(14)) && !battleInfo.get(14).equals(""))
					battleMaster.setType(battleInfo.get(14));
				if (Objects.nonNull(battleInfo.get(15)) && !battleInfo.get(15).equals(""))
					battleMaster.setMajorDeath(Integer.parseInt(battleInfo.get(15)));
				if (Objects.nonNull(battleInfo.get(16)) && !battleInfo.get(16).equals(""))
					battleMaster.setMajorCapture(Integer.parseInt(battleInfo.get(16)));
				if (Objects.nonNull(battleInfo.get(17)) && !battleInfo.get(17).equals(""))
					attackerMaster.setAttacker(Integer.parseInt(battleInfo.get(17)));
				if (Objects.nonNull(battleInfo.get(18)) && !battleInfo.get(18).equals(""))
					defenderMaster.setDefenderSize(Integer.parseInt(battleInfo.get(18)));
				if (Objects.nonNull(battleInfo.get(19)) && !battleInfo.get(19).equals(""))
					attackerMaster.setAttackerCommander(battleInfo.get(19));
				if (Objects.nonNull(battleInfo.get(20)) && !battleInfo.get(20).equals(""))
					defenderMaster.setDefenderCommander(battleInfo.get(20));
				if (Objects.nonNull(battleInfo.get(21)) && !battleInfo.get(21).equals(""))
					if (battleInfo.get(21).equals("1"))
						battleMaster.setSummer(true);
					else
						battleMaster.setSummer(false);
				if (Objects.nonNull(battleInfo.get(22)) && !battleInfo.get(22).equals(""))
					battleMaster.setLocation(battleInfo.get(22));
				if (Objects.nonNull(battleInfo.get(23)) && !battleInfo.get(23).equals(""))
					battleMaster.setRegion(battleInfo.get(23));
				if (battleInfo.size() == 25)
					if (Objects.nonNull(battleInfo.get(24)) && !battleInfo.get(24).equals(""))
						battleMaster.setNotes(battleInfo.get(24));

				battleMaster.setDefenderId(defenderMaster);
				battleMaster.setAttackerId(attackerMasterRepository.save(attackerMaster));
				battleMaster.setDefenderId(defenderMasterRepository.save(defenderMaster));
				battleMasterRepository.save(battleMaster);
				listOfBattleMaster.add(battleMaster);
			}

		} catch (Exception e) {
			return null;
		}
		return listOfBattleMaster;
	}

}
