package com.example.demo.dto;

import java.util.List; 

import com.example.demo.Entity.GenAnwAnwender;

public class Details {
	
	private GenAnwAnwender g;
	private List<LiveSystems> livesystems;
	private List<ProcessDetails> processdetails;
	public List<ProcessDetails> getProcessdetails() {
		return processdetails;
	}
	public void setProcessdetails(List<ProcessDetails> processdetails) {
		this.processdetails = processdetails;
	}
	public GenAnwAnwender getG() {
		return g;
	}
	public void setG(GenAnwAnwender g) {
		this.g = g;
	}
	public List<LiveSystems> getLivesystems() {
		return livesystems;
	}
	public void setLivesystems(List<LiveSystems> livesystems) {
		this.livesystems = livesystems;
	}
	

}
