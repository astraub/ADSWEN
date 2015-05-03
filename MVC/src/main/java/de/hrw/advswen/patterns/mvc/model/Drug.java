package de.hrw.advswen.patterns.mvc.model;

import java.util.List;

public class Drug {
	private String name;
	private double price;
	private List<String> goodFor;
	
	public String getName() {
		return name;
	}
	
	public List<String> getGoodFor() {
		return goodFor;
	}
	
	public double getPrice() {
		return price;
	}
		
	public Drug(String name, double price, List<String> goodFor){
		this.name = name;
		this.price = price;
		this.goodFor = goodFor;	
	}
}
