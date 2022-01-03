package com.adminportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.content.Events;
import com.adminportal.content.Jmol;
import com.adminportal.repository.JmolRepository;


public interface JmolService {

	List<Jmol> findAll();
	
	void addJmol(Jmol jmol);
}
