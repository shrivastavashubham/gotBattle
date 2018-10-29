package com.greenlightplanet.got.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.greenlightplanet.got.entity.BattleMaster;
import com.greenlightplanet.got.service.UploadService;

/*
 * Controller used to store data about battles
 */
@RestController
public class UploadController {

	@Autowired
	UploadService uploadService;

	/*
	 * API End Point which is used to store data of battles using CSV file takes CSV
	 * file as an input return all the data that has been saved
	 */
	@RequestMapping(value = "/uploadCsv", method = RequestMethod.POST)
	public List<BattleMaster> uploadCsv(@RequestParam("file") MultipartFile file) {
		return uploadService.uploadCsv(file);

	}
}
