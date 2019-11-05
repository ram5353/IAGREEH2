package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.GenAnwAnwender;
import com.example.demo.Entity.UserDetails;


public interface IAgreeService {
   
	
	public List<GenAnwAnwender> getData(String id);

	public List getUserData(String id);

	public List getAuthorisedSystems(int anwId);

	public List getProcessDetails(String anwRacf);
	
	

}
