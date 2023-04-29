package com.tennisdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	@PutMapping(value="/updateTennisData/{id}")
	public sports updateTennisData(@RequestBody sports t,@PathVariable int id)
	{
		return tennisService.saveTennisData(t);
	}
	
	@DeleteMapping(value="/DeleteTennisData/{id}")
	public void deleteTennisData(@PathVariable("id") int playerID)
	{
		 tennisService.deleteTennisData(playerID);
	}
	@GetMapping("/auto/{field}")
	public List<sports>sortCrudD(@PathVariable String field){
		return tennisService.sortTennisData(field);
	}
	@GetMapping("/autio")
	public List<sports>sortCrudDes(@RequestParam String field){
		return tennisService.sortDesTennisData(field);
	}
	
	
	@GetMapping("/pagination")
	
	public List<sports> pagination(@RequestParam int offset,@RequestParam int pagesize){
		
		return tennisService.getpaginationss(offset,pagesize);
	}
	
	@GetMapping("/sortpagination")
	
	public List<sports> sortpagination(@RequestParam int offset,@RequestParam int pagesize,String field){
		
		return tennisService.getsortpaginations(offset,pagesize,field);
	}
	
	@GetMapping("/login")
	public String login(@RequestParam String user,@RequestParam int pass)
	{
		return tennisService.login(user, pass);
	}
	@PostMapping("/reg")
	public sports regid(@RequestBody sports id) {
		
		
		return tennisService.register(id);
		
	}
}
