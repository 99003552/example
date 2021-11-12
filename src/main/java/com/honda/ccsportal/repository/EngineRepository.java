package com.honda.ccsportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.honda.ccsportal.entity.Engine;

public interface EngineRepository extends JpaRepository<Engine,Integer> {

	public List<Engine> findByEngineId(int engine_id);
	
}
