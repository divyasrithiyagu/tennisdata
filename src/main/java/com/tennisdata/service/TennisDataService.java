package com.tennisdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tennisdata.dao.TennisDataRepository;
import com.tennisdata.model.sports;


@Service
public class TennisDataService {
@Autowired
     TennisDataRepository dataRepository;
     public List<sports> getAllDatas(){
    	 List<sports>dataList=dataRepository.findAll();
    	 return dataList;
     }
     public sports saveTennisData(sports t)
     {
    	 sports obj=dataRepository.save(t);
    	 return obj;
     }
     
     public sports updateTennisData(sports t)
     {
    	 sports obj=dataRepository.save(t);
    	 return obj;
     }
     
     public void deleteTennisData(int playerID)
     {
    	 dataRepository.deleteById(playerID);
    	 
     }
}
