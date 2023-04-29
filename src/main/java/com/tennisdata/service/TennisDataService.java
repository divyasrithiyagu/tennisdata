package com.tennisdata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
     
     /*public sports updateTennisData(sports t)
     {
    	 sports obj=dataRepository.save(t);
    	 return obj;
     }*/
     public sports updateTennisData(sports t,int id)
     {
    	 Optional<sports> optional=dataRepository.findById(id);
    	 sports obj=null;
    	 if(optional.isPresent())
    	 {
    		 /*obj=optional.get();
    		 obj.setPlayerId(t.getPlayerID());
    		 obj.setWon(t.getWon());
    		 obj.setFirstname(t.getFirstname());
    		 obj.setLastname(t.getLastname());
    		 obj.setMonthofjoining(t.getMonthofjoining());
    		 obj.setLevel(t.getLevel());
    		 obj.setAge(t.getAge());
    		 obj.setHeight(t.getHeight());
    		 obj.setYearofexperience(t.getYearofexperience());
    		 obj.setFootwearEvaluation(t.getFootwearEvaluation());*/
    		 dataRepository.saveAndFlush(t);
    	 }
    	 return obj;
    	 //return dataRepository.sava(t);
     }
     
     public sports getTennisData(int playerID) {
 		sports s=dataRepository.findById(playerID).get();
 		return s;
 	}
     
     
     public void deleteTennisData(int playerID)
     {
    	 dataRepository.deleteById(playerID);
    	 
     }
     
     public List<sports>sortTennisData(String field){
 		return dataRepository.findAll(Sort.by(field));
 	}
 	
 	public List<sports> sortDesTennisData(String field){
 		
 		return dataRepository.findAll(Sort.by(Direction.DESC,field));
 	}

 	public List<sports> getpaginationss(int offset, int pagesize) {
 		
 		Page<sports> paging=dataRepository.findAll(PageRequest.of(offset, pagesize));
 		return paging.getContent();
 	}

 	public List<sports> getsortpaginations(int offset, int pagesize,String field) {
 		
 		Page<sports> paging=dataRepository.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
 		return paging.getContent();
 	}
 	public String login(String user,int pass) {
		List<sports> li = dataRepository.findAll();
		String res = null;
		for(sports l : li) {
			if(l.getFirstname().equals(user)&&l.getPlayerID()==pass) {
				res = "Login sucessfull";
			}
		}
		if(res==null) {
			res= "Login failed";
		}
		return res;
	}
public sports register(@RequestBody sports id) {
		
		return dataRepository.save(id);
	}
}
