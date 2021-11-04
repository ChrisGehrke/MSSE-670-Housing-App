package com;

public class HousingSelector {

	private String Prefabricated;
	private String Conex;
	private String Printed;
	
	public HousingSelector(String prefabricated, String conex, String printed) {
		super();
		Prefabricated = prefabricated;
		Conex = conex;
		Printed = printed;
	}
	
	public String getPrefabricated() {
		return Prefabricated;
	}
	public void setPrefabricated(String prefabricated) {
		Prefabricated = prefabricated;
	}
	public String getConex() {
		return Conex;
	}
	public void setConex(String conex) {
		Conex = conex;
	}
	public String getPrinted() {
		return Printed;
	}
	public void setPrinted(String printed) {
		Printed = printed;
	}
	

	}


