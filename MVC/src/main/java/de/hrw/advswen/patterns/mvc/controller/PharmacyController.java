package de.hrw.advswen.patterns.mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import de.hrw.advswen.patterns.mvc.model.Drug;
import de.hrw.advswen.patterns.mvc.model.Pharmacy;
import de.hrw.advswen.patterns.mvc.view.PharmacyView;
import de.hrw.advswen.patterns.mvc.view.View;

public class PharmacyController {
	private View view;
	private Pharmacy model;
	
	public PharmacyController(View view, Pharmacy model){
		this.view = view;
		this.model = model;
		if(view instanceof PharmacyView)
		{
			((PharmacyView) this.view).addCureButtonListener(new CureButtonListener());
		}
	}
	
	public void methodenaufruf(){
		this.searchForMedicine();
	}
	
	private void searchForMedicine(){
		String symptoms;
		boolean found= false;
		
		try{
			//read symptoms
			symptoms = view.getSymptoms();
			
			//Look for available drugs in Pharmacy for specific symptom
			for (Drug drug : model.getAvailableDrugs()){
				List<String> goodFor = new ArrayList<String>();
				goodFor = drug.getGoodFor();
					
				for (String helpsAgainst : goodFor){
					if (helpsAgainst.equals(symptoms)){
						found = true;
						view.showMessageDialog("Drug: " + drug.getName() + "\nPrice: " + drug.getPrice() + "$" );
						break;
					}
				}
			}
			//Show not found message
			if(!found) {
				view.showMessageDialog("No Drug available");
			}
		}
		catch(Exception ex){
			view.displayErrorMessage("Fehler");
		}
	}
	
	class CureButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			searchForMedicine();
		}
	}
}
