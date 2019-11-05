package com.example.demo.dao;

import java.util.List;

import com.example.demo.Entity.GenAnwAnwender;

public interface IAgreeDao {

	List<GenAnwAnwender> getData(String id);

	List getUserData(String id);

	List getAuthorisedSystems(int anwId);

	List getProcessDetails(String anwRacf);

}
