package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.GenAnwAnwender;
import com.example.demo.Entity.UserDetails;
import com.example.demo.dao.IAgreeDao;
@Service
public class IAgreeServiceImpl implements IAgreeService {

	
	@Autowired
	IAgreeDao iagreedao;
	
	@Override
	public List<GenAnwAnwender> getData(String id) {
		// TODO Auto-generated method stub
		return iagreedao.getData(id);
	}

	@Override
	public List getUserData(String id) {
		// TODO Auto-generated method stub
		return iagreedao.getUserData(id);
	}

	@Override
	public List getAuthorisedSystems(int anwId) {
		// TODO Auto-generated method stub
		return iagreedao.getAuthorisedSystems(anwId);
	}

	@Override
	public List getProcessDetails(String anwRacf) {
		// TODO Auto-generated method stub
		return iagreedao.getProcessDetails(anwRacf);
	}

}
