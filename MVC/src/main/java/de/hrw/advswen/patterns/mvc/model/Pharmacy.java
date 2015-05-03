package de.hrw.advswen.patterns.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {

	public Pharmacy() {
		this.availableDrugs = new ArrayList<Drug>();
	}

	// List of all drugs in stock
	private List<Drug> availableDrugs;

	public List<Drug> getAvailableDrugs() {
		return availableDrugs;
	}

	public void storeNewDrug(Drug drug) {
		availableDrugs.add(drug);
	}

}
