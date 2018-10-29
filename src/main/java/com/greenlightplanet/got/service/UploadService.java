package com.greenlightplanet.got.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.greenlightplanet.got.entity.BattleMaster;

/*
 * Interface that contains function declaration for inserting battle related information
 */
@Service
public interface UploadService {

	/*
	 * Method Declaration which is used to store data of battles using CSV file takes CSV
	 * file as an input return all the data that has been saved
	 */
	public List<BattleMaster> uploadCsv(MultipartFile file);

}
