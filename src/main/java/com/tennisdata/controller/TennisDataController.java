package com.tennisdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tennisdata.model.sports;
import com.tennisdata.service.TennisDataService;


@RestController
public class TennisDataController {
	@Autowired
	TennisDataService tennisService;
	@GetMapping(value="/fetchdata")
	public List<sports>getAllDatas(){
		List<sports>dataList=tennisService.getAllDatas();
		return dataList;
	}
     
	@PostMapping(value="/saveTennisData")
	public sports saveTennisData(@RequestBody sports t)
	{
		return tennisService.saveTennisData(t);
	}
	@PutMapping(value="/updateTennisData")
	public sports updateTennisData(@RequestBody sports t)
	{
		return tennisService.saveTennisData(t);
	}
	
	@DeleteMapping(value="/deleteTennisData/{id}")
	public void deleteTennisData(@PathVariable("id") int playerID)
	{
		 tennisService.deleteTennisData(playerID);
		 //hello
	}
	
	
}
