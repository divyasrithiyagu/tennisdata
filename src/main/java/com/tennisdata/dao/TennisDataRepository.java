package com.tennisdata.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.tennisdata.model.sports;


@Repository
public interface TennisDataRepository extends JpaRepository<sports,Integer>{

	//positional parameter
			//@Query("select t from  TennisData t where t.monthofjoining=?1 and t.firstname=?2" )
			//public List<sports> getTennisDataByDepartment(String monthofjoining,String firstname);
		
		//List<sports> findByNameStartingWith(String prefix);
		//List<sports> findByNameEndingWith(String suffix);
		//List<sports> findByDepartment(String monthofjoining);
}
