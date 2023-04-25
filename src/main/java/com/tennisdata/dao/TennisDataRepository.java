package com.tennisdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tennisdata.model.sports;

public interface TennisDataRepository extends JpaRepository<sports,Integer>{

}
