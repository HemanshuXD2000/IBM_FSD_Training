package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
	
}
