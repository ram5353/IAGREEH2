package com.example.demo.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.GenAnwAnwender;
import com.example.demo.Entity.UserDetails;
import com.example.demo.dto.Details;
import com.example.demo.dto.LiveSystems;
import com.example.demo.dto.ProcessDetails;
import com.example.demo.service.IAgreeService;
@CrossOrigin
@RestController
public class IAgreeController {

	@Autowired
	IAgreeService iagreeservice;
	
	@GetMapping("/getData/{id}")
	public @ResponseBody Details getDataOfUser(@PathVariable String id){
		
		Details d = new Details();
		System.out.println("in Controller");
		List listofUsers = iagreeservice.getUserData(id);
	
		GenAnwAnwender g = new GenAnwAnwender();
		for(Object obj:listofUsers) {
			
			Object[] ob = (Object[]) obj;
			g.setAnwName(ob[0].toString());
			g.setAnwVorname(ob[1].toString());
			g.setAnwEmployeeNr(ob[2].toString());
			g.setAnwEmail(ob[3].toString());
			g.setAnwId((int) ob[4]);
			g.setAnwRacf(id);
		}
		
		
		List listofLiveSystems = iagreeservice.getAuthorisedSystems(g.getAnwId());
		List<LiveSystems> livesystems = new ArrayList<LiveSystems>();
		for(Object live:listofLiveSystems) {
			Object[] ob = (Object[]) live;
			LiveSystems l = new LiveSystems();
			l.setSysId((Integer) ob[0]);
			l.setSysName(ob[1].toString());	
			livesystems.add(l);
			
		}

		List listOfProcess = iagreeservice.getProcessDetails(g.getAnwRacf()); 
		List<ProcessDetails> pdetails = new ArrayList<ProcessDetails>();
		for(Object process: listOfProcess) {
			Object[] ob = (Object[]) process;
			ProcessDetails p = new ProcessDetails();
			p.setVgUuid(ob[0].toString());
			p.setVgStatus(ob[1].toString());
			p.setVgVerfallsdatum((Date) ob[2]);
			p.setVgEingestelltAm((Date) ob[3]);
			p.setSysId((Integer) ob[4]);
			if(null!=ob[5])
			p.setLastUpdatedClientId(ob[5].toString());
			p.setSysName(ob[6].toString());
			p.setHisHistoryEvent(ob[7].toString());
			pdetails.add(p);
		}
		
		
		d.setG(g);
		d.setLivesystems(livesystems);
		d.setProcessdetails(pdetails);
		return d;

	}
	
	
}
